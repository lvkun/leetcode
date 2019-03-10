package site.lvkun.leetcode.number_of_1_bits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testHammingWeight() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.hammingWeight(Integer.valueOf("00000000000000000000000000001011", 2)));
        Assert.assertEquals(1, solution.hammingWeight(Integer.valueOf("00000000000000000000000010000000", 2)));
        Assert.assertEquals(31, solution.hammingWeight(-3));
    }
}
