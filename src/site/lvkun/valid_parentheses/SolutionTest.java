package site.lvkun.valid_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsValid() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
        Assert.assertTrue(solution.isValid("{[]}"));
    }
}
