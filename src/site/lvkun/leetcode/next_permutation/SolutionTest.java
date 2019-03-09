package site.lvkun.leetcode.next_permutation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testNextPermutation() {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3};
        int[] result1 = {1,3,2};
        solution.nextPermutation(nums1);
        Assert.assertArrayEquals(nums1, result1);

        int[] nums2 = {3,2,1};
        int[] result2 = {1,2,3};
        solution.nextPermutation(nums2);
        Assert.assertArrayEquals(nums2, result2);

        int[] nums3 = {1,1,5};
        int[] result3 = {1,5,1};
        solution.nextPermutation(nums3);
        Assert.assertArrayEquals(nums3, result3);
    }
}
