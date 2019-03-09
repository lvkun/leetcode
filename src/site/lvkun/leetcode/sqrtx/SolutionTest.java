package site.lvkun.leetcode.sqrtx;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSqrtX() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(4));
        Assert.assertEquals(2, solution.mySqrt(8));
    }
}
