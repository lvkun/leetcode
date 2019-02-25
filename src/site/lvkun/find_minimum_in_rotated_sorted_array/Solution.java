package site.lvkun.find_minimum_in_rotated_sorted_array;

class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return nums[start];
        }

        int result = nums[0];

        while (start < end - 1) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[start]) {
                result = Math.min(result, nums[start]);
                start = mid + 1;
            } else if (nums[mid] < nums[start]) {
                result = Math.min(result, nums[end]);
                end = mid;
            } else {
                start++;
            }
        }

        result = Math.min(result, nums[start]);
        result = Math.min(result, nums[end]);

        return result;
    }
}