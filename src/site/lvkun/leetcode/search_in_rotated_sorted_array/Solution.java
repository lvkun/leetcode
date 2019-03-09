package site.lvkun.leetcode.search_in_rotated_sorted_array;

class Solution {
    private boolean mayInRange(int[] nums, int start, int end, int target) {
        if (nums[start] < nums[end]) {
            return nums[start] <= target && target <= nums[end];
        } else {
            return target >= nums[start] || target <= nums[end];
        }
    }

    private int searchInternal(int[] nums, int start, int end, int target) {
        if (end - start < 2) {
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (mayInRange(nums, start, mid, target)) {
            return searchInternal(nums, start, mid, target);
        }
        if (mayInRange(nums, mid, end, target)) {
            return searchInternal(nums, mid, end, target);
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return searchInternal(nums, 0, nums.length - 1, target);
    }
}