package site.lvkun.leetcode.house_robber_ii;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            sumOdd += nums[i];
            sumEven += nums[i + 1];
        }

        int sumOddEnd = sumOdd;
        if (nums.length % 2 == 1) {
            sumOddEnd -= nums[0];
            sumOddEnd += nums[nums.length - 1];
        }

        return Math.max(sumEven, Math.max(sumOdd, sumOddEnd));
    }
}