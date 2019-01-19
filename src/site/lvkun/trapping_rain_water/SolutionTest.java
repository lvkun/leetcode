package site.lvkun.trapping_rain_water;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testTrap() {
        Solution solution = new Solution();
        int water = solution.trap(array(0,1,0,2,1,0,1,3,2,1,2,1));
        Assert.assertEquals(6, water);
    }
}
