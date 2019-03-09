package site.lvkun.leetcode.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null ||matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = 0;

        List<Integer> result = new ArrayList<>();
        while (row <= m / 2 && col <= n / 2) {

            for (int i = col; i < n - col; i++) {
                result.add(matrix[row][i]);
            }

            for (int i = row + 1; i < m - row; i++) {
                result.add(matrix[i][n - col - 1]);
            }

            if (row == m - row - 1 || col == n - col - 1) {
                break;
            }

            for (int i = n - col - 2; i >= col; i--) {
                result.add(matrix[m - row - 1][i]);
            }

            for (int i = m - row - 2; i >= row + 1; i--) {
                result.add(matrix[i][col]);
            }

            row++;
            col++;
        }

        return result;
    }
}
