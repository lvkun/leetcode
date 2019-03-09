package site.lvkun.leetcode.multiply_strings;

class Solution {
    private void addTo(char[] result, int n, int carry, int index) {
        int value = result[index] - '0';
        int sum = value + n;
        int newValue = sum % 10;
        int newCarry = carry + sum / 10;

        result[index] = (char) (newValue + '0');

        if (newCarry != 0) {
            addTo(result, newCarry, 0, index + 1);
        }
    }

    public String multiply(String num1, String num2) {
        char[] charArr1 = num1.toCharArray();
        char[] charArr2 = num2.toCharArray();

        char[] result = new char[charArr1.length + charArr2.length];
        for (int i = 0; i < result.length; i ++) {
            result[i] = '0';
        }

        for (int i = 0; i < charArr1.length; i++) {
            char c1 = charArr1[charArr1.length - i - 1];

            for (int j = 0; j < charArr2.length; j++) {
                char c2 = charArr2[charArr2.length - j - 1];

                int r = (c1 - '0') * (c2 - '0');
                int c = r / 10;
                int m = r % 10;

                addTo(result, m, c, i + j);
            }
        }

        boolean skip = true;
        StringBuilder builder = new StringBuilder();
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == '0' && skip) {
                continue;
            }

            if (result[i] != '0') {
                skip = false;
            }

            builder.append(result[i]);
        }

        return builder.toString();
    }
}
