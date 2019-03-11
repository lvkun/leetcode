package site.lvkun.leetcode.number_of_islands;

class Solution {
    private static final char CHAR_VISITED = 'X';
    private void setVisited(char[][] grid, int row, int col) {
        grid[row][col] = CHAR_VISITED;
    }

    private boolean isVisited(char[][] grid, int row, int col) {
        return grid[row][col] == CHAR_VISITED || grid[row][col] == '0';
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (!isVisited(grid, row, col)) {
                    visit(grid, row, col);
                    count++;
                }
            }
        }

        return count;
    }

    public void visit(char[][] grid, int row, int col) {
        if (isVisited(grid, row, col)) {
            return;
        }

        setVisited(grid, row, col);

        if (row > 0) {
            visit(grid, row - 1, col);
        }

        if (col > 0) {
            visit(grid, row, col - 1);
        }

        if (row < grid.length - 1) {
            visit(grid, row + 1, col);
        }

        if (col < grid[0].length - 1) {
            visit(grid, row, col + 1);
        }
    }
}