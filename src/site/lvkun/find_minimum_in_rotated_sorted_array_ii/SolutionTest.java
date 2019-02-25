package site.lvkun.find_minimum_in_rotated_sorted_array_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testFindMin() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.findMin(array(1,3,5)));
        Assert.assertEquals(0, solution.findMin(array(2,2,2,0,1)));
    }
}
