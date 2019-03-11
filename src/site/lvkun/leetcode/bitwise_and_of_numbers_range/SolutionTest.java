package site.lvkun.leetcode.bitwise_and_of_numbers_range;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.rangeBitwiseAnd(5, 7));
        Assert.assertEquals(0, solution.rangeBitwiseAnd(0, 1));
    }
}
