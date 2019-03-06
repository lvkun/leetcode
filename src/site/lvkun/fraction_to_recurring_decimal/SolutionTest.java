package site.lvkun.fraction_to_recurring_decimal;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFractionToDecimal() {
        Solution solution = new Solution();
        Assert.assertEquals("0.5", solution.fractionToDecimal(1, 2));
        Assert.assertEquals("2", solution.fractionToDecimal(2, 1));
        Assert.assertEquals("0.(6)", solution.fractionToDecimal(2, 3));
        Assert.assertEquals("0.(142857)", solution.fractionToDecimal(1, 7));
    }
}
