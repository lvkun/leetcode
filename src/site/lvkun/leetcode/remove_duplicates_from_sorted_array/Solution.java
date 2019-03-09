package site.lvkun.leetcode.remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int cur = 0;
        int next = 1;
        while (next < nums.length) {
            if (nums[cur] != nums[next]) {
                cur++;
                nums[cur] = nums[next];
            }
            next++;
        }

        return cur + 1;
    }
}
