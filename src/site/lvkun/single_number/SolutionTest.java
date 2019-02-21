package site.lvkun.single_number;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSingleNumber() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.singleNumber(array(2,2,1)));
        Assert.assertEquals(4, solution.singleNumber(array(4,1,2,1,2)));
    }
}
