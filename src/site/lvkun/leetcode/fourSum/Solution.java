package site.lvkun.leetcode.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> resultList = new ArrayList<>();

        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(nums[start]);
                list.add(nums[end]);
                resultList.add(list);
                start++;
            }
        }

        return resultList;
    }

    private List<List<Integer>> threeSum(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = start; i < nums.length; i++) {
            List<List<Integer>> twoSumResult = twoSum(nums, i + 1, target - nums[i]);
            if (!twoSumResult.isEmpty()) {
                for (List<Integer> list : twoSumResult) {
                    list.add(0, nums[i]);
                }
                result.addAll(twoSumResult);
            }
        }
        return result;
    }

    private List<List<Integer>> fourSum(int[] nums, int start, int target) {
        List<List<Integer>> result = threeSum(nums, start + 1, target - nums[start]);
        if (!result.isEmpty()) {
            for (List<Integer> list : result) {
                list.add(0, nums[start]);
            }
        }
        return result;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            List<List<Integer>> result = fourSum(nums, i, target);
            if (result != null) {
                resultList.addAll(result);
            }
        }

        return resultList;
    }
}
