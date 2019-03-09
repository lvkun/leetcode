package site.lvkun.leetcode.maximum_subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum <= 0) {
                sum = 0;
                continue;
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}