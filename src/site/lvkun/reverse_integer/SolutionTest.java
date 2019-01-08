package site.lvkun.reverse_integer;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testReverse() {
        Solution solution = new Solution();
        Assert.assertEquals(123, solution.reverse(321));
        Assert.assertEquals(-321, solution.reverse(-123));
        Assert.assertEquals(21, solution.reverse(120));
    }
}
