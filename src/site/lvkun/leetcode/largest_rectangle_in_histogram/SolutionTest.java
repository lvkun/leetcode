package site.lvkun.leetcode.largest_rectangle_in_histogram;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testLargestRectangleArea() {
        Solution solution = new Solution();
        Assert.assertEquals(10,
                solution.largestRectangleArea(array(2,1,5,6,2,3)));

        Assert.assertEquals(3,
                solution.largestRectangleArea(array(2,0,2,1,1)));
    }
}
