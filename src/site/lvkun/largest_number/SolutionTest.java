package site.lvkun.largest_number;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testLargestNumber() {
        Solution solution = new Solution();
        Assert.assertEquals("210", solution.largestNumber(array(10,2)));
        Assert.assertEquals("9534330", solution.largestNumber(array(3,30,34,5,9)));
    }
}
