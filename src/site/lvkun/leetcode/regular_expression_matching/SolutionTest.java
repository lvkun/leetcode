package site.lvkun.leetcode.regular_expression_matching;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMatch() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isMatch("aa", "a"));
        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("ab", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));
        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }
}
