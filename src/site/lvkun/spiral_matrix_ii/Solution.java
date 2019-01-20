package site.lvkun.spiral_matrix_ii;

class Solution {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int row = 0;
        int col = 0;
        int num = 1;

        while (row <= n / 2 && col <= n / 2) {
            for (int i = col; i < n - col; i++) {
                result[row][i] = num++;
            }

            for (int i = row + 1; i < n - row; i++) {
                result[i][n - col - 1] = num++;
            }

            if (num > n * n) {
                break;
            }

            for (int i = n - col - 2; i >= col; i--) {
                result[n - row - 1][i] = num++;
            }

            for (int i = n - row - 2; i > row; i--) {
                result[i][col] = num++;
            }

            row++;
            col++;
        }

        return result;
    }
}
