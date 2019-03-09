package site.lvkun.leetcode.climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testClimbStairs() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.climbStairs(2));
        Assert.assertEquals(3, solution.climbStairs(3));
    }
}
