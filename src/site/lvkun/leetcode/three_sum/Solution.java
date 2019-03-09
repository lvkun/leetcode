package site.lvkun.leetcode.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<Integer> twoSum(int[] nums, int start, int target) {
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
                return list;
            }
        }

        return null;
    }

    private List<Integer> threeSum(int[] nums, int start) {
        List<Integer> result = twoSum(nums, start + 1, - nums[start]);
        if (result != null) {
            result.add(0, nums[start]);
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            List<Integer> item = threeSum(nums, i);
            if (item != null) {
                result.add(item);
            }
        }
        return result;
    }
}
