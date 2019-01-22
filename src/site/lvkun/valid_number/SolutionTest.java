package site.lvkun.valid_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsNumber() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isNumber("0"));
        Assert.assertTrue(solution.isNumber(" 0.1 "));
        Assert.assertFalse(solution.isNumber("abc"));
        Assert.assertFalse(solution.isNumber("1 a"));
        Assert.assertTrue(solution.isNumber("2e10"));
        Assert.assertTrue(solution.isNumber(" -90e3   "));
        Assert.assertFalse(solution.isNumber(" 1e"));
        Assert.assertFalse(solution.isNumber("e3"));
        Assert.assertTrue(solution.isNumber(" 6e-1"));
        Assert.assertFalse(solution.isNumber(" 99e2.5 "));
        Assert.assertTrue(solution.isNumber("53.5e93"));
        Assert.assertFalse(solution.isNumber(" --6 "));
        Assert.assertFalse(solution.isNumber("-+3"));
        Assert.assertFalse(solution.isNumber("95a54e53"));
    }
}
