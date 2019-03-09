package site.lvkun.leetcode.factorial_trailing_zeroes;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tesTrailingZeroes() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.trailingZeroes(3));
        Assert.assertEquals(1, solution.trailingZeroes(5));
    }
}
