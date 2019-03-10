package site.lvkun.leetcode.reverse_bits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testReverseBits() {
        Solution solution = new Solution();
        Assert.assertEquals((int)Integer.valueOf("00111001011110000010100101000000", 2), solution.reverseBits(Integer.valueOf("00000010100101000001111010011100", 2)));
    }
}
