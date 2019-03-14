package site.lvkun.leetcode.minimum_size_subarray_sum;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = 0;

        int sum = nums[0];
        int minLength = nums.length + 1;

        while (end < nums.length) {
            while (sum < s && end < nums.length) {
                sum += nums[end++];
            }

            while (sum >= s) {
                minLength = Math.min(minLength, end - start);

                sum -= nums[start++];
            }
        }

        return minLength == nums.length + 1 ? 0 : minLength;
    }
}

