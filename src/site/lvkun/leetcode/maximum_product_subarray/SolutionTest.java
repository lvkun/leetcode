package site.lvkun.leetcode.maximum_product_subarray;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaxProduct() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxProduct(array(2,3,-2,4)));
    }
}
