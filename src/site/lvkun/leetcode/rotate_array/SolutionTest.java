package site.lvkun.leetcode.rotate_array;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testRotate() {
        Solution solution = new Solution();
        int[] nums = array(1,2,3,4,5,6,7);
        solution.rotate(nums, 3);
        Assert.assertArrayEquals(array(5,6,7,1,2,3,4), nums);

        nums = array(-1,-100,3,99);
        solution.rotate(nums, 2);
        Assert.assertArrayEquals(array(3,99,-1,-100), nums);
    }
}
