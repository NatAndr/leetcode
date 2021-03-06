package array;

public class NumberOfIslands {
//    Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
//    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//    You may assume all four edges of the grid are all surrounded by water.
//
//Example 1:
//
//Input:
//11110
//11010
//11000
//00000
//
//Output: 1

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    check(grid, i, j);
                }
            }
        }
        return count;
    }

    private void check(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        check(grid, i - 1, j);
        check(grid, i, j + 1);
        check(grid, i + 1, j);
        check(grid, i, j - 1);
    }

    public static void main(String[] args) {
//        char[][] A = {
//            {'1', '1', '1', '1', '0'},
//            {'1', '1', '0', '1', '0'},
//            {'1', '1', '0', '1', '0'},
//            {'0', '0', '0', '0', '0'}
//        };
//        char[][] A = {{'0'}};
        char[][] A = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int i = new NumberOfIslands().numIslands(A);
        System.out.println(i);
    }

}
