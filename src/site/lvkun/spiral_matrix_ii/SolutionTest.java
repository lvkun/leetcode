package site.lvkun.spiral_matrix_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testGenerateMatrix() {
        Solution solution = new Solution();
        int[][] result = solution.generateMatrix(3);

        Assert.assertArrayEquals(array(1, 2, 3), result[0]);
        Assert.assertArrayEquals(array(8, 9, 4), result[1]);
        Assert.assertArrayEquals(array(7, 6, 5), result[2]);
    }
}
