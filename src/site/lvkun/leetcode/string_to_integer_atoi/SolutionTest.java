package site.lvkun.leetcode.string_to_integer_atoi;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testAtoI() {
        Solution solution = new Solution();
//        Assert.assertEquals(42, solution.myAtoi("42"));
//        Assert.assertEquals(-42, solution.myAtoi("   -42"));
//        Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
//        Assert.assertEquals(0, solution.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    }
}
