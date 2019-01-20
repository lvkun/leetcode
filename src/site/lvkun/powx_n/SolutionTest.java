package site.lvkun.powx_n;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testPow() {
        Solution solution = new Solution();
        Assert.assertEquals(1024.00000, solution.myPow(2.00000, 10), 0.0001);
        Assert.assertEquals(9.26100, solution.myPow(2.10000, 3), 0.0001);
        Assert.assertEquals(0.25000, solution.myPow(2.00000, -2), 0.0001);
    }
}
