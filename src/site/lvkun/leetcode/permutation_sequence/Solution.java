package site.lvkun.leetcode.permutation_sequence;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        if (n == 0) {
            return "";
        }

        if (n == 1) {
            return "1";
        }

        int[] factor = new int[n];
        factor[0] = 1;
        for (int i = 1; i < n; i++) {
            factor[i] = factor[i - 1] * i;
        }

        List<Integer> result = new ArrayList<>();
        List<Integer> candidates = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }

        k--;
        for (int i = 0; i < n; i++) {
            int f = factor[n - i - 1];
            int index = k / f;
            k = k % f;

            result.add(candidates.get(index));
            candidates.remove(index);
        }

        StringBuilder builder = new StringBuilder();
        for (Integer integer : result) {
            builder.append(integer);
        }

        return builder.toString();
    }
}