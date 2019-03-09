package site.lvkun.leetcode.roman_to_integer;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRomanToInt() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.romanToInt("III"));
        Assert.assertEquals(4, solution.romanToInt("IV"));
        Assert.assertEquals(9, solution.romanToInt("IX"));
        Assert.assertEquals(58, solution.romanToInt("LVIII"));
        Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
