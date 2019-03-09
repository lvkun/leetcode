package site.lvkun.leetcode.add_binary;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testAddBinary() {
        Solution solution = new Solution();
        Assert.assertEquals("100", solution.addBinary("11", "1"));
        Assert.assertEquals("10101", solution.addBinary("1010", "1011"));
    }
}
