package site.lvkun.search_insert_position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 0) {
            return 0;
        }

        if (target <= nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
                if (nums[low] >= target) {
                    return low;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
                if (nums[high] < target) {
                    return mid;
                }
            } else {
                return mid;
            }
        }

        return 0;
    }
}