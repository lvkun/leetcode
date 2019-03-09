package site.lvkun.leetcode.remove_duplicates_from_sorted_array_ii;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int count = 1;
        int cur = 1;
        int next = 1;

        while (next < nums.length) {
            if (nums[next - 1] == nums[next]) {
                if (count < 2) {
                    nums[cur++] = nums[next];
                    count++;
                }
            } else {
                nums[cur++] = nums[next];
                count = 1;
            }
            next++;
        }

        return cur;
    }
}
