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

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(6, 5);
        game.printBoard();
    }
}

