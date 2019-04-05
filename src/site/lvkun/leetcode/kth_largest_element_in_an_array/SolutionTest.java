package site.lvkun.leetcode.kth_largest_element_in_an_array;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testFindKthLargest() {
        Solution solution = new Solution();
        Assert.assertEquals(5,
                solution.findKthLargest(array(3,2,1,5,6,4), 2));
        Assert.assertEquals(4,
                solution.findKthLargest(array(3,2,3,1,2,4,5,5,6), 4));
    }
}
