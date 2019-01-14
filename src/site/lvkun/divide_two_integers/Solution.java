package site.lvkun.divide_two_integers;

class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = (dividend > 0 && divisor < 0) ||
                (dividend < 0 && divisor > 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (divisor > dividend) {
            return 0;
        }

        int result = 0;
        int mul = divisor;
        int r = 1;
        while (divisor < dividend) {
            if (mul << 1 > dividend) {
                result += r;
                dividend = dividend - mul;
                r = 1;
            } else {
                mul = mul << 1;
                r = r << 1;
            }
        }

        return negative? -result : result;
    }
}