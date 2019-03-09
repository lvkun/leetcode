package site.lvkun.leetcode.wildcard_matching;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsMatch() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isMatch("aa", "a"));
        Assert.assertTrue(solution.isMatch("aa", "*"));
        Assert.assertTrue(solution.isMatch("", "*"));
        Assert.assertFalse(solution.isMatch("cb", "?a"));
        Assert.assertTrue(solution.isMatch("adceb", "*a*b"));
        Assert.assertFalse(solution.isMatch("acdcb", "a*c?b"));
    }
}
