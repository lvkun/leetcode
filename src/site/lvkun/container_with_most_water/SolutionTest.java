package site.lvkun.container_with_most_water;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {
    @Test
    public void testMaxArea() {
        Solution solution = new Solution();
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49, solution.maxArea(height));
    }
}
