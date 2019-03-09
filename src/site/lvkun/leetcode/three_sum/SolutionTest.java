package site.lvkun.leetcode.three_sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testThreeSum() {
        Solution solution = new Solution();
        List<List<Integer>> list = solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
        Assert.assertEquals(list.get(0), Arrays.asList(-1, -1, 2));
        Assert.assertEquals(list.get(1), Arrays.asList(-1, 0, 1));
    }
}
