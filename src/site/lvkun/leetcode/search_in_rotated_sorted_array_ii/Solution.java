package site.lvkun.leetcode.search_in_rotated_sorted_array_ii;

class Solution {
    private boolean mayInRange(int[] nums, int start, int end, int target) {
        if (nums[start] < nums[end]) {
            return nums[start] < target && target < nums[end];
        } else {
            return target > nums[start] || target < nums[end];
        }
    }

    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (mayInRange(nums, start, mid, target)) {
                end = mid - 1;
            } else if (mayInRange(nums, mid, end, target)) {
                start = mid + 1;
            } else {
                end--;
            }
        }

        return false;
    }
}
