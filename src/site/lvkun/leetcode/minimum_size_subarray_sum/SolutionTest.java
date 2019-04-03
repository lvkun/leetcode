package site.lvkun.leetcode.minimum_size_subarray_sum;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMinSubArrayLen() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.minSubArrayLen(7, array(2,3,1,2,4,3)));
    }
}
