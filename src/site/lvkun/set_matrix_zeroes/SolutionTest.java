package site.lvkun.set_matrix_zeroes;

import org.junit.Test;

import static site.lvkun.common.ArrayUtils.assertMatrixEquals;
import static site.lvkun.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testSetZeroes() {
        Solution solution = new Solution();
        int[][] matrix = matrixInt("[\n" +
                "  [1,1,1],\n" +
                "  [1,0,1],\n" +
                "  [1,1,1]\n" +
                "]");
        solution.setZeroes(matrix);

        int[][] expected = matrixInt("[\n" +
                "  [1,0,1],\n" +
                "  [0,0,0],\n" +
                "  [1,0,1]\n" +
                "]");

        assertMatrixEquals(expected, matrix);

        matrix = matrixInt("[\n" +
                "  [0,1,2,0],\n" +
                "  [3,4,5,2],\n" +
                "  [1,3,1,5]\n" +
                "]");
        solution.setZeroes(matrix);

        expected = matrixInt("[\n" +
                "  [0,0,0,0],\n" +
                "  [0,4,5,0],\n" +
                "  [0,3,1,0]\n" +
                "]");
        assertMatrixEquals(expected, matrix);
    }
}
