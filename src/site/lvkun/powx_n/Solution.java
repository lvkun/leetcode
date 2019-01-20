package site.lvkun.powx_n;

class Solution {
    private double pow(double x, int n) {
        if (n == 0) return 1;
        double half = pow(x, n / 2);
        if (n % 2 == 0) return half * half;
        return x * half * half;
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / pow(x, -n);
        }

        return pow(x, n);
    }
}