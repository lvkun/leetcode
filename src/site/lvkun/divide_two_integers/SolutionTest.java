package site.lvkun.divide_two_integers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testDivide() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.divide(10, 3));
        Assert.assertEquals(-2, solution.divide(7, -3));
    }
}
