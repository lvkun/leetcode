package site.lvkun.leetcode.combination_sum_iii;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private void combine(int k, int n, int start, Stack<Integer> result, List<List<Integer>> resultList) {
        if (n < 0) {
            return;
        }

        if (n == 0 && k == result.size()) {
            resultList.add(new ArrayList<>(result));
        }

        for (int i = start; i <= 9; i++) {
            result.push(i);
            combine(k, n - i, i + 1, result, resultList);
            result.pop();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        Stack<Integer> result = new Stack<>();

        combine(k, n, 1, result, resultList);

        return resultList;
    }
}
