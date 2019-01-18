package site.lvkun.count_and_say;

class Solution {
    public String countAndSay(int n) {
        if (n < 1) {
            return "";
        }

        if (n == 1) {
            return "1";
        }

        String result = countAndSay(n - 1);

        StringBuilder builder = new StringBuilder();
        int count = 0;
        char curChar = 0;
        for (char c : result.toCharArray()) {
            if (c != curChar) {
                if (count != 0) {
                    builder.append(count);
                    builder.append(curChar);
                }
                curChar = c;
                count = 1;
            } else {
                count++;
            }
        }

        builder.append(count);
        builder.append(curChar);

        return builder.toString();
    }
}
