package site.lvkun.leetcode.number_of_1_bits;

public class Solution {
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        while (n != 0) {
            if ((n & mask) != 0) {
                count++;
            }
            n >>>= 1; // must use unsigned right shift operator;
        }
        return count;
    }
}