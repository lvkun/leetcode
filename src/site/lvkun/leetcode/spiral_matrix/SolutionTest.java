package site.lvkun.leetcode.spiral_matrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static site.lvkun.leetcode.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testSpiralOrder() {
        Solution solution = new Solution();
        List<Integer> result = solution.spiralOrder(matrixInt("[\n" +
                " [ 1, 2, 3 ],\n" +
                " [ 4, 5, 6 ],\n" +
                " [ 7, 8, 9 ]\n" +
                "]"));

        Assert.assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), result);

        result = solution.spiralOrder(matrixInt("[\n" +
                "  [1, 2, 3, 4],\n" +
                "  [5, 6, 7, 8],\n" +
                "  [9,10,11,12]\n" +
                "]"));
        Assert.assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), result);
    }
}
