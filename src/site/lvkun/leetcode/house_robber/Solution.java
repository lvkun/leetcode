package site.lvkun.leetcode.house_robber;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int index = 0;

        int sumOdd = 0;
        int sumEven = 0;

        while (index < nums.length - 1) {
            sumOdd += nums[index];
            sumEven += nums[index + 1];

            index += 2;
        }

        if (index == nums.length - 1) {
            sumOdd += nums[index];
        }

        return Math.max(sumOdd, sumEven);
    }
}
