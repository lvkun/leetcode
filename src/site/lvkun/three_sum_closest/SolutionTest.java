package site.lvkun.three_sum_closest;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testThreeSumClosest() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
