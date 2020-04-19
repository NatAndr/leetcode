package array;

import java.util.Arrays;
import java.util.Collections;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int rows = matrix.length;

        if (rows == 0) {
            return new int[0];
        }

        int cols = matrix[0].length;
        if (cols == 0) {
            return new int[0];
        }

        int[] result = new int[rows * cols];
        int k = 0;
        int cur;
        int dir = 1;

        for (int r = 0; r < rows; r++) {
            for (int row = r, col = 0; row >= 0 && col < cols; row--, col++) {
                if (dir == 1) {
                    result[k++] = matrix[col][row];
                } else {
                    result[k++] = matrix[row][col];
                }
                cur = matrix[col][row];
                System.out.print(" " + cur);
            }
            dir *= -1;

            System.out.println("!");
        }

        for (int c = 1; c < cols; c++) {
            for (int row = rows - 1, col = c; row >= 0 && col < cols; row--, col++) {
                result[k++] = matrix[row][col];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] i = new DiagonalTraverse().findDiagonalOrder(arr);
        System.out.println(Arrays.toString(i));
    }
}
