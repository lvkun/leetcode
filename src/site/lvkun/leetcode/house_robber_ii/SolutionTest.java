package site.lvkun.leetcode.house_robber_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testRob() {
        Solution solution = new Solution();
//        Assert.assertEquals(3, solution.rob(array(2,3,2)));
        Assert.assertEquals(4, solution.rob(array(1,2,3,1)));
    }
}
