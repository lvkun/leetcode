package site.lvkun.leetcode.number_of_islands;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.matrixChar;

public class SolutionTest {
    @Test
    public void testNumIslands() {
        Solution solution = new Solution();
        int result = solution.numIslands(matrixChar("1,1,1,1,0\n" +
                "1,1,0,1,0\n" +
                "1,1,0,0,0\n" +
                "0,0,0,0,0"));
        Assert.assertEquals(1, result);

        result = solution.numIslands(matrixChar("1,1,0,0,0\n" +
                "1,1,0,0,0\n" +
                "0,0,1,0,0\n" +
                "0,0,0,1,1"));
        Assert.assertEquals(3, result);
    }
}
