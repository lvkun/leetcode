package site.lvkun.leetcode.rectangle_area;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testComputeArea() {
        Solution solution = new Solution();
        int result = solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        Assert.assertEquals(45, result);
    }
}
