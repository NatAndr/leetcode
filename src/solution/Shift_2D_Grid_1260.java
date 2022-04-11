package solution;


//Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
//
//In one shift operation:
//
//Element at grid[i][j] moves to grid[i][j + 1].
//Element at grid[i][n - 1] moves to grid[i + 1][0].
//Element at grid[m - 1][n - 1] moves to grid[0][0].
//Return the 2D grid after applying shift operation k times.


import java.util.ArrayList;
import java.util.List;

public class Shift_2D_Grid_1260 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Shift_2D_Grid_1260().shiftGrid(A, 1);
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int mn = m * n;
        int[] arr = new int[mn];

        int t = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[t++] = grid[i][j];
            }
        }

        k = k % mn;
        reverse(arr, 0, mn - k - 1);
        reverse(arr, mn - k, mn - 1);
        reverse(arr, 0, mn - 1);

        t = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(arr[t++]);
            }
            res.add(list);
        }

        return res;
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
