package site.lvkun.longest_valid_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLongestValidParentheses() {
        Solution solution = new Solution();
//        Assert.assertEquals(2, solution.longestValidParentheses("(()"));
        Assert.assertEquals(4, solution.longestValidParentheses(")()())"));
    }
}
