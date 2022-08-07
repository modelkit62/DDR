package Matrix1_SetMatrixZeroes_X;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static int[][] setZeroes(int[][] matrix) {

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int r : row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[r][i] = 0;
            }
        }
        for (int c : col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1,1,1}, {1,0,1}, {1,1,1} };
        print2D(setZeroes(intervals));

    }

    private static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }


}



