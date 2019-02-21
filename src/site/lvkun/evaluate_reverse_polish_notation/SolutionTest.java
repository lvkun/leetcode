package site.lvkun.evaluate_reverse_polish_notation;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testEvalRPN() {
        Solution solution = new Solution();
        Assert.assertEquals(9, solution.evalRPN(array("2", "1", "+", "3", "*")));
        Assert.assertEquals(6, solution.evalRPN(array("4", "13", "5", "/", "+")));
        Assert.assertEquals(22, solution.evalRPN(array("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")));
    }
}
