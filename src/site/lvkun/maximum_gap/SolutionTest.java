package site.lvkun.maximum_gap;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaximumGap() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.maximumGap(array(3,6,9,1)));
        Assert.assertEquals(0, solution.maximumGap(array(10)));
    }
}
