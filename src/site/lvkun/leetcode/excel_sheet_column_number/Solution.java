package site.lvkun.leetcode.excel_sheet_column_number;

class Solution {
    private int fromChar(char c) {
        return c - 'A' + 1;
    }

    public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();

        int result = 0;

        for (int i = 0; i < charArray.length; i++) {
            int v = fromChar(charArray[i]);

            result = 26 * result + v;
        }


        return result;
    }
}