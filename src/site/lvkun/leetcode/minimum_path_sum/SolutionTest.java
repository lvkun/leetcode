package site.lvkun.leetcode.minimum_path_sum;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testMinPathSum() {
        Solution solution = new Solution();
        int minPathSum = solution.minPathSum(matrixInt("[\n" +
                "  [1,3,1],\n" +
                "  [1,5,1],\n" +
                "  [4,2,1]\n" +
                "]"));
        Assert.assertEquals(7, minPathSum);
    }
}
