package site.lvkun.leetcode.count_and_say;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCountAndSay() {
        Solution solution = new Solution();
        Assert.assertEquals("", solution.countAndSay(0));
        Assert.assertEquals("1", solution.countAndSay(1));
        Assert.assertEquals("11", solution.countAndSay(2));
        Assert.assertEquals("21", solution.countAndSay(3));
        Assert.assertEquals("1211", solution.countAndSay(4));
        Assert.assertEquals("111221", solution.countAndSay(5));
        Assert.assertEquals("312211", solution.countAndSay(6));
        Assert.assertEquals("13112221", solution.countAndSay(7));
        Assert.assertEquals("1113213211", solution.countAndSay(8));
        Assert.assertEquals("31131211131221", solution.countAndSay(9));
        Assert.assertEquals("13211311123113112211", solution.countAndSay(10));

    }
}
