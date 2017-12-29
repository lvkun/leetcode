package site.lvkun.median_of_two_sorted_arrays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testMedianOfTwoSortedArrays() {
        Solution solution = new Solution();
        double median = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3});
        Assert.assertEquals(median, 2.0f, 0.01f);
    }

}
