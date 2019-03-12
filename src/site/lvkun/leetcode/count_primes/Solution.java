package site.lvkun.leetcode.count_primes;

import java.util.BitSet;

class Solution {
    public int countPrimes(int n) {
        BitSet bitSet = new BitSet();

        int result = 0;
        for (int i = 2; i < n; i++) {
            if (!bitSet.get(i)) {
                result++;

                for (int j = 2; j * i < n; j++) {
                    bitSet.set(i * j, true);
                }
            }
        }
        return result;
    }
}