package site.lvkun.sort_colors;

class Solution {
    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;
        int i = 0;

        while (i < right) {
            if (nums[i] < 1) {
                swap(nums, i, left);
                i++;
                left++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right);
                right--;
            }
        }
    }
}