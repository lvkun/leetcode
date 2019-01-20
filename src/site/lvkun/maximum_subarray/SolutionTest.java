package site.lvkun.maximum_subarray;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaxSubArray() {
        Solution solution = new Solution();
        Assert.assertEquals(6,
                solution.maxSubArray(array(-2,1,-3,4,-1,2,1,-5,4)));
    }
}
