package site.lvkun.minimum_path_sum;

class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >=0; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                }

                if (i == m - 1) {
                    grid[i][j] += grid[i][j + 1];
                    continue;
                }

                if (j == n - 1) {
                    grid[i][j] += grid[i + 1][j];
                    continue;
                }

                grid[i][j] += Math.min(grid[i][j + 1], grid[i + 1][j]);
            }
        }

        return grid[0][0];
    }
}
