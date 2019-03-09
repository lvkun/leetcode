package site.lvkun.leetcode.unique_paths_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int paths = solution.uniquePathsWithObstacles(matrixInt("[\n" +
                "  [0,0,0],\n" +
                "  [0,1,0],\n" +
                "  [0,0,0]\n" +
                "]"));
        Assert.assertEquals(2, paths);
    }
}
