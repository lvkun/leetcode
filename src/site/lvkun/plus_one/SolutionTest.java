package site.lvkun.plus_one;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testPlusOne() {
        Solution solution = new Solution();

        int[] result = solution.plusOne(array(1,2,3));
        Assert.assertArrayEquals(array(1,2,4), result);

        result = solution.plusOne(array(4,3,2,1));
        Assert.assertArrayEquals(array(4,3,2,2), result);

        result = solution.plusOne(array(9,9,9));
        Assert.assertArrayEquals(array(1,0,0,0), result);
    }
}
