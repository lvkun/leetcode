package site.lvkun.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {
        int result = 0;
        int sign = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                continue;
            } else if (c == '-' && result == 0) {
                sign = -1;
            } else if (c >= '0' && c <= '9') {
                int n = (c - '0');
                result = result * 10 + n;
            } else {
                break;
            }
        }

        return sign * result;
    }
}
