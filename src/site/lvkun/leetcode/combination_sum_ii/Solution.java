package site.lvkun.leetcode.combination_sum_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    private void combine(int[] candidates, int target, int start, Stack<Integer> result, List<List<Integer>> resultList) {
        if (target == 0) {
            resultList.add(new ArrayList<>(result));
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            result.push(candidates[i]);
            combine(candidates, target - candidates[i], i + 1, result, resultList);
            result.pop();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> resultList = new ArrayList<>();
        Stack<Integer> result = new Stack<>();

        combine(candidates, target, 0, result, resultList);

        return resultList;
    }
}
