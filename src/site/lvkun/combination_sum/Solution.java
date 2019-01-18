package site.lvkun.combination_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private void combine(int[] candidates, int target, int start, Stack<Integer> result, List<List<Integer>> resultList) {
        if (target == 0) {
            resultList.add(new ArrayList<>(result));
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }

            result.push(candidates[i]);
            combine(candidates, target - candidates[i], i, result, resultList);
            result.pop();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return null;
        }

        List<List<Integer>> resultList = new ArrayList<>();
        Stack<Integer> result = new Stack<>();

        combine(candidates, target, 0, result, resultList);

        return resultList;
    }
}