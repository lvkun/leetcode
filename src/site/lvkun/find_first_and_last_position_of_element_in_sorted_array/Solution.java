package site.lvkun.find_first_and_last_position_of_element_in_sorted_array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        int[] result = new int[] {-1, -1};

        if (nums == null || nums.length == 0) {
            return result;
        }

        if (target < nums[low] || target > nums[high]) {
            return result;
        }

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
                high = mid;

                while (low > -1 && nums[low - 1] == target) {
                    low--;
                }

                while (high < nums.length && nums[high + 1] == target) {
                    high++;
                }

                result[0] = low;
                result[1] = high;
                return result;
            }
        }

        return result;
    }
}
