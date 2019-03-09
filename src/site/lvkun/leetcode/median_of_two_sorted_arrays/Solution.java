package site.lvkun.leetcode.median_of_two_sorted_arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;

        double last = 0;
        double secondLast = 0;

        while (i1 + i2 < (nums1.length + nums2.length) / 2 + 1) {
            secondLast = last;

            if (i1 >= nums1.length) {
                last = nums2[i2++];
            } else if (i2 >= nums2.length) {
                last = nums1[i1++];
            } else if (nums1[i1] < nums2[i2]) {
                last = nums1[i1++];
            } else {
                last = nums2[i2++];
            }
        }

        if ((nums1.length + nums2.length) % 2 == 0) {
            return (last + secondLast) / 2;
        }

        return last;
    }
}
