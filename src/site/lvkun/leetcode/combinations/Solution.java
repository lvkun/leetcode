package site.lvkun.leetcode.combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private void combine(int start, int end, int k, Stack<Integer> result, List<List<Integer>> resultList) {
        for (int i = start; i <= end; i++) {
            result.push(i);
            if (k == 1) {
                resultList.add(new ArrayList<>(result));
            } else {
                combine(i + 1, end, k - 1, result, resultList);
            }
            result.pop();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultList = new ArrayList<>();

        Stack<Integer> result = new Stack<>();

        combine(1, n, k, result, resultList);

        return resultList;
    }
}