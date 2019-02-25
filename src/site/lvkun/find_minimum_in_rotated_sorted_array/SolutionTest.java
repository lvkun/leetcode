package site.lvkun.find_minimum_in_rotated_sorted_array;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testFindMin() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.findMin(array(3,4,5,1,2)));
        Assert.assertEquals(1, solution.findMin(array(1,2,3,4,5)));
        Assert.assertEquals(1, solution.findMin(array(5,4,3,2,1)));
        Assert.assertEquals(1, solution.findMin(array(1)));
    }
}
