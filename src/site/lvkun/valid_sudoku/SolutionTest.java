package site.lvkun.valid_sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsValid() {
        site.lvkun.valid_parentheses.Solution solution = new site.lvkun.valid_parentheses.Solution();
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
        Assert.assertTrue(solution.isValid("{[]}"));
    }
}
