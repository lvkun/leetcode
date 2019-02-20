package site.lvkun.surrounded_regions;

import org.junit.Test;

import static site.lvkun.common.ArrayUtils.assertMatrixEquals;
import static site.lvkun.common.ArrayUtils.matrixChar;

public class SolutionTest {
    @Test
    public void testSolve() {
        Solution solution = new Solution();

        char[][] board = matrixChar("X,X,X,X\n" +
                "X,O,O,X\n" +
                "X,X,O,X\n" +
                "X,O,X,X");
        solution.solve(board);
        char[][] expected = matrixChar("X,X,X,X\n" +
                "X,X,X,X\n" +
                "X,X,X,X\n" +
                "X,O,X,X");
        assertMatrixEquals(expected, board);
    }
}
