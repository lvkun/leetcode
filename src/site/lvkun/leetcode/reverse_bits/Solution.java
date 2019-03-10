package site.lvkun.leetcode.reverse_bits;

public class Solution {
    private boolean getBit(int n, int bit) {
        int masked = 1 << bit;
        return (n & masked) != 0;
    }

    private int setBit(int n, int bit, boolean v) {
        if (v) {
            n |= 1 << bit;
        } else {
            n &= ~(1 << bit);
        }

        return n;
    }

    public int reverseBits(int n) {
        for (int i = 0; i < 15; i++) {
            int j = 31 - i;
            boolean vi = getBit(n, i);
            boolean vj = getBit(n, j);
            n = setBit(n, i, vj);
            n = setBit(n, j, vi);
        }

        return n;
    }
}