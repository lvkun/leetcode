package site.lvkun.leetcode.three_sum_closest;

import java.util.Arrays;

public class Solution {
    private int twoSumClosest(int[] nums, int start, int target) {
        int end = nums.length - 1;
        int closest = Integer.MAX_VALUE;
        while (start < end) {
            int sum = nums[start] + nums[end];

            if (closest == Integer.MAX_VALUE) {
                closest = sum;
            } else {
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
            }

            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                return target;
            }
        }

        return closest;
    }

    private int threeSumClosest(int[] nums, int start, int target) {
        int result = twoSumClosest(nums, start + 1, target - nums[start]);
        return result + nums[start];
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            if (closest == Integer.MAX_VALUE) {
                closest = threeSumClosest(nums, i, target);
            } else {
                int r = threeSumClosest(nums, i, target);
                if (Math.abs(r - target) < Math.abs(closest - target)) {
                    closest = r;
                }
            }
        }
        return closest;
    }
}
