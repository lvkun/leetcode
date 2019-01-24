package site.lvkun.search_a_2d_matrix;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testSearchMatrix() {
        Solution solution = new Solution();

        int[][] matrix;
        matrix = matrixInt("[\n" +
                "  [1,   3,  5,  7],\n" +
                "  [10, 11, 16, 20],\n" +
                "  [23, 30, 34, 50]\n" +
                "]");
        Assert.assertTrue(solution.searchMatrix(matrix, 3));

        matrix = matrixInt("[\n" +
                "  [1,   3,  5,  7],\n" +
                "  [10, 11, 16, 20],\n" +
                "  [23, 30, 34, 50]\n" +
                "]");
        Assert.assertFalse(solution.searchMatrix(matrix, 13));
    }
}
