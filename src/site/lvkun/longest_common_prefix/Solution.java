package site.lvkun.longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int col = 0;
        while (true) {
            char curChar = strs[0].charAt(col);
            for (int row = 1; row < strs.length; row++) {
                if (col == strs[row].length() || curChar != strs[row].charAt(col)) {
                    return strs[0].substring(0, col);
                }
            }

            col++;
        }
    }
}
