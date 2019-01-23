package site.lvkun.sqrtx;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double last_result = x;
        double result = (x / last_result + last_result) / 2.0;

        while (Math.abs(last_result - result) > 0.5) {
            last_result = result;
            result = (x / result + result) / 2.0;
        }

        return (int) Math.floor(result);
    }
}
