package array;

//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
//
//Example:
//
//Input:
//
//1 0 1 0 0
//1 0 1 1 1
//1 1 1 1 1
//1 0 0 1 0
//
//Output: 4

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length;
        if (n == 0) return 0;
        int max = 0;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max * max;
    }

    public static void main(String[] args) {
        char[][] arr = new char[][]{
            {'1'}
        };
        int i = new MaximalSquare().maximalSquare(arr);
        System.out.println(i);
    }
}
