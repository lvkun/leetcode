package site.lvkun.leetcode.happy_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsHappy() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isHappy(19));
        Assert.assertFalse(solution.isHappy(11));
    }
}
