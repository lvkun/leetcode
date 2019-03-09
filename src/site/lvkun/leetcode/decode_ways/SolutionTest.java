package site.lvkun.leetcode.decode_ways;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testNumDecodings() {
        Solution solution = new Solution();
        Assert.assertEquals(2,
                solution.numDecodings("12"));
        Assert.assertEquals(3,
                solution.numDecodings("226"));
    }
}
