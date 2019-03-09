package site.lvkun.leetcode.first_missing_positive;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {

    @Test
    public void testFirstMissingPositive() {
        Solution solution = new Solution();
        Assert.assertEquals(3,
                solution.firstMissingPositive(array(1,2,0)));
        Assert.assertEquals(2,
                solution.firstMissingPositive(array(3,4,-1,1)));
        Assert.assertEquals(1,
                solution.firstMissingPositive(array(7,8,9,11,12)));
    }
}
