package array;

import java.util.Arrays;
import java.util.List;

public interface BinaryMatrix {
    default int get(int x, int y) {
        return matrix[x][y];
    }

    default List<Integer> dimensions() {
        return Arrays.asList(matrix.length, matrix[0].length);
    }

    int[][] matrix = new int[][]{
//        {0, 0, 0, 0, 0, 1, 1, 1},
//        {0, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0}
    };
}
