package z2_GameOfLife;

public class GameOfLife {
    private int column;
    private int row;
    private int[][] board;

    public GameOfLife(int column, int row) {
        this.column = column;
        this.row = row;
        board = new int[row][column];
    }

    public void printBoard() {
        System.out.println("========");
        for (int r = 0; r < row; r++) {
            String line = "|";
            for (int c = 0; c < column; c++) {
                if (this.board[r][c] == 0) {
                    line = line + ".";
                } else {
                    line = line + "x";
                }
            }
            line = line + "|";
            System.out.println(line);
        }
        System.out.println("========");
    }

    public void setAlive(int x, int y){
        this.board[x][y] = 1;
    }

    public int getAliveNeighbours(int x, int y){
        int count = 0;
        count += isBorder(x-1, y-1);
        count += isBorder(x, y-1);
        count += isBorder(x+1, y-1);

        count += isBorder(x-1, y);
        count += isBorder(x+1, y);

        count += isBorder(x-1, y+1);
        count += isBorder(x, y+1);
        count += isBorder(x+1, y+1);

        return count;
    }

    private int isBorder(int x, int y) {
        if(x < 0 || x >= row) return 0;
        if(y < 0 || y >= column) return 0;
        return this.board[x][y];
    }

    private void nextGeneration(){
        int[][] newBoard = new int[row][column];
        for(int y = 0; y < row; y++){
            for (int x = 0; x < column; x++){
                int aliveNeighbours = getAliveNeighbours(x,y);
                if(isBorder(x,y) == 1){
                    if(aliveNeighbours < 2 ){
                        newBoard[y][x] = 0;
                    } else if(aliveNeighbours == 2 || aliveNeighbours == 3){
                        newBoard[y][x] = 1;
                    } else if(aliveNeighbours > 3){
                        newBoard[y][x] = 0;
                    }
                } else {
                    if (aliveNeighbours == 3) {
                        newBoard[x][y] = 1;
                    }
                }
            }
        }
        this.board = newBoard;
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(6, 5);
        game.printBoard();
    }
}

