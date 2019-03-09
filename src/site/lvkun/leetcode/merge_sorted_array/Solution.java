package site.lvkun.leetcode.merge_sorted_array;

class Solution {
    private void swap(int[] nums1, int i, int[] nums2, int j) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length < m + n) {
            return;
        }

        if (nums2 == null || nums2.length < n) {
            return;
        }

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                swap(nums1, i++, nums2, j++);
            }
        }

        j = 0;
        while (j < n) {
            nums1[m + j] = nums2[j];
            j++;
        }
    }
}
