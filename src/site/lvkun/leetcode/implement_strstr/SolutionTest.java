package site.lvkun.leetcode.implement_strstr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testStrStr() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.strStr("hello", "ll"));
        Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }
}
