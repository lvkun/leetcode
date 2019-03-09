package site.lvkun.leetcode.single_number_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSingleNumber() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.singleNumber(array(2,2,3,2)));
        Assert.assertEquals(99, solution.singleNumber(array(0,1,0,1,0,1,99)));
    }
}
