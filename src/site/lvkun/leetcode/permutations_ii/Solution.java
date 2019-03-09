package site.lvkun.leetcode.permutations_ii;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private void permute(int[] nums, int start, Stack<Integer> result, List<List<Integer>> resultList) {
        if (start == nums.length) {
            resultList.add(new ArrayList<>(result));
            return;
        }

        result.push(nums[start]);
        permute(nums, start + 1, result, resultList);
        result.pop();
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] == nums[start]) {
                continue;
            }

            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;

            result.push(nums[start]);
            permute(nums, start + 1, result, resultList);
            result.pop();

            nums[i] = nums[start];
            nums[start] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Stack<Integer> result = new Stack<>();

        permute(nums, 0, result, resultList);

        return resultList;
    }
}
