package site.lvkun.leetcode.edit_distance;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMinDistance() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.minDistance("horse", "ros"));
        Assert.assertEquals(5, solution.minDistance("intention", "execution"));
    }
}
