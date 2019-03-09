package site.lvkun.leetcode.scramble_string;

// TODO: retry
class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        int n = s1.length();
        if (n == 0) {
            return false;
        }

        boolean[][][] dp = new boolean[n][n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
            }
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                for (int j = 0; j < n - len + 1; j++) {
                    for (int k = 1; k < len; k++) {
                        dp[i][j][len] |= dp[i][j][k] && dp[i + k][j + k][len - k]
                                || dp[i][j + len - k][k]&&dp[i + k][j][len - k];
                    }
                }
            }
        }

        return dp[0][0][n];
    }
}