package site.lvkun.leetcode.search_a_2d_matrix;

class Solution {


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] < target) {
                start = mid + 1;
            } else if (matrix[row][col] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}