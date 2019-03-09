package site.lvkun.leetcode.remove_duplicates_from_sorted_array_ii;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,1,2,2,3};
        int length = solution.removeDuplicates(nums);

        Assert.assertEquals(5, length);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(1, nums[1]);
        Assert.assertEquals(2, nums[2]);
        Assert.assertEquals(2, nums[3]);
        Assert.assertEquals(3, nums[4]);

        nums = new int[]{0,0,1,1,1,1,2,3,3};
        length = solution.removeDuplicates(nums);
        Assert.assertEquals(7, length);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(0, nums[1]);
        Assert.assertEquals(1, nums[2]);
        Assert.assertEquals(1, nums[3]);
        Assert.assertEquals(2, nums[4]);
        Assert.assertEquals(3, nums[5]);
        Assert.assertEquals(3, nums[6]);
    }
}
