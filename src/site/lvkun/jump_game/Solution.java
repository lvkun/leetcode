package site.lvkun.jump_game;

class Solution {
    private boolean canJump(int[] nums, int start) {
        if (start == nums.length - 1) {
            return true;
        }

        int steps = nums[start];
        if (steps == 0) {
            return false;
        }

        for (int i = 1; i <= steps; i++) {
            if (canJump(nums, start + i)) {
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }
}
