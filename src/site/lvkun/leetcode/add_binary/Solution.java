package site.lvkun.leetcode.add_binary;

class Solution {
    private boolean getBit(String s, int i) {
        if (i < s.length()) {
            char c = s.charAt(s.length() - i - 1);
            if (c == '1') {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int maxLength = Math.max(a.length(), b.length());
        boolean carry = false;
        for (int i = 0; i < maxLength; i++) {
            boolean aBit = getBit(a, i);
            boolean bBit = getBit(b, i);

            boolean result = aBit ^ bBit ^ carry;
            carry = aBit && bBit || carry && aBit || carry && bBit;

            if (result) {
                builder.append('1');
            } else {
                builder.append('0');
            }
        }

        if (carry) {
            builder.append('1');
        }

        return builder.reverse().toString();
    }
}