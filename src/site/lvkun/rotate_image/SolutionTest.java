package site.lvkun.rotate_image;

import org.junit.Test;

import static site.lvkun.common.ArrayUtils.assertMatrixEquals;
import static site.lvkun.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testRotate() {
        Solution solution = new Solution();
        int[][] matrix = matrixInt("[\n" +
                "  [1,2,3],\n" +
                "  [4,5,6],\n" +
                "  [7,8,9]\n" +
                "]");
        solution.rotate(matrix);

        int[][] expected = matrixInt("[\n" +
                "  [7,4,1],\n" +
                "  [8,5,2],\n" +
                "  [9,6,3]\n" +
                "]");

        assertMatrixEquals(expected, matrix);

        matrix = matrixInt("[\n" +
                "  [ 5, 1, 9,11],\n" +
                "  [ 2, 4, 8,10],\n" +
                "  [13, 3, 6, 7],\n" +
                "  [15,14,12,16]\n" +
                "]");
        solution.rotate(matrix);

        expected = matrixInt("[\n" +
                "  [15,13, 2, 5],\n" +
                "  [14, 3, 4, 1],\n" +
                "  [12, 6, 8, 9],\n" +
                "  [16, 7,10,11]\n" +
                "]");

        assertMatrixEquals(expected, matrix);
    }
}
