package site.lvkun.zigzag_conversion;

public class Solution {
    public String convert(String s, int numRows) {
        int length = 2 * numRows - 2;
        int row = 0;
        StringBuilder builder = new StringBuilder();
        while (row < numRows) {
            int turn = 0;
            while (true) {
                int start = turn * length;
                turn++;

                int pos1 = row + start;
                if (pos1 < s.length()) {
                    builder.append(s.charAt(pos1));
                } else {
                    break;
                }

                if (row == 0 || row == numRows / 2 + 1) {
                    continue;
                }

                int pos2 = (length - row) + start;
                if (pos2 < s.length()) {
                    builder.append(s.charAt(pos2));
                } else {
                    break;
                }
            }
            row++;
        }
        return builder.toString();
    }
}
