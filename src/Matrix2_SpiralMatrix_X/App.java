package Matrix2_SpiralMatrix_X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList();

        int firstRow = 0;
        int lastRow = matrix.length - 1;
        int firstColumn = 0;
        int lastColumn = matrix[0].length - 1;

        while (firstRow <= lastRow && firstColumn <= lastColumn) {

            for (int i = firstColumn; i <= lastColumn; i++) {
                result.add(matrix[firstRow][i]);
            }
            firstRow++;
            for (int i = firstRow; i <= lastRow; i++) {
                result.add(matrix[i][lastColumn]);
            }
            lastColumn--;
            // ---------------------------------------------------
            if (firstRow <= lastRow) {
                for (int i = lastColumn; i >= firstColumn; i--) {
                    result.add(matrix[lastRow][i]);
                }
            }
            lastRow--;
            if (firstColumn <= lastColumn) {
                for (int i = lastRow; i >= firstRow; i--) {
                    result.add(matrix[i][firstColumn]);
                }
            }
            firstColumn++;

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(spiralOrder(intervals));
    }
}
