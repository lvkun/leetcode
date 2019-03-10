package site.lvkun.leetcode.rotate_array;

class Solution {
    public void rotate(int[] nums, int k) {
        int i = 0;
        int turn = 0;
        int start = 0;
        int newNum = nums[i];
        int oldNum;
        while (turn < nums.length) {
            i = (i + k) % nums.length;

            oldNum = nums[i];
            nums[i] = newNum;
            newNum = oldNum;

            if (i == start) {
                start++;
                i++;

                newNum = nums[i];
            }
            turn++;
        }
    }
}