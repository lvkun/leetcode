package site.lvkun.leetcode.unique_paths;

class Solution {
    public int uniquePaths(int m, int n) {
        int[] result = new int[n];
        result[0] = 1;
        for (int row = 0; row < m; row++) {
            for (int col= 1; col < n; col++) {
                result[col] += result[col - 1];
            }
        }
        return result[n - 1];
    }
}