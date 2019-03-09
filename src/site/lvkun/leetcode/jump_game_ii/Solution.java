package site.lvkun.leetcode.jump_game_ii;

class Solution {
    private int jump(int[] nums, int start) {
        if (start == nums.length - 1) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[start]; i++) {
            if (start + i >= nums.length) {
                break;
            }

            int step = 1 + jump(nums, start + i);
            min = Math.min(min, step);
        }

        return min;
    }

    public int jump(int[] nums) {
        return jump(nums, 0);
    }
}