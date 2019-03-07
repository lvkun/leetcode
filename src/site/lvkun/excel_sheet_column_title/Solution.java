package site.lvkun.excel_sheet_column_title;

import java.util.Stack;

class Solution {

    private char getChar(int i) {
        return (char) ('A' + i - 1);
    }

    public String convertToTitle(int n) {
        Stack<Character> result = new Stack<>();

        while (n > 0) {
            int r = n % 26;

            if (r == 0) {
                result.push('Z');
                n -= 26;
            } else {
                result.push(getChar(r));
            }

            n = n / 26;
        }

        StringBuilder sb = new StringBuilder();
        while (!result.isEmpty()) {
            sb.append(result.pop());
        }
        return sb.toString();
    }
}