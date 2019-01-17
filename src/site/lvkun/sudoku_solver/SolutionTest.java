package site.lvkun.sudoku_solver;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.dump;
import static site.lvkun.common.ArrayUtils.matrix;

public class SolutionTest {
    private static final String example = "[\n" +
            "  [\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],\n" +
            "  [\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],\n" +
            "  [\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],\n" +
            "  [\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],\n" +
            "  [\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],\n" +
            "  [\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],\n" +
            "  [\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],\n" +
            "  [\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],\n" +
            "  [\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]\n" +
            "]";

    private static final String expected = "[\n" +
            "  [\"5\",\"3\",\"4\",\"6\",\"7\",\"8\",\"9\",\"1\",\"2\"],\n" +
            "  [\"6\",\"7\",\"2\",\"1\",\"9\",\"5\",\"3\",\"4\",\"8\"],\n" +
            "  [\"1\",\"9\",\"8\",\"3\",\"4\",\"2\",\"5\",\"6\",\"7\"],\n" +
            "  [\"8\",\"5\",\"9\",\"7\",\"6\",\"1\",\"4\",\"2\",\"3\"],\n" +
            "  [\"4\",\"2\",\"6\",\"8\",\"5\",\"3\",\"7\",\"9\",\"1\"],\n" +
            "  [\"7\",\"1\",\"3\",\"9\",\"2\",\"4\",\"8\",\"5\",\"6\"],\n" +
            "  [\"9\",\"6\",\"1\",\"5\",\"3\",\"7\",\"2\",\"8\",\"4\"],\n" +
            "  [\"2\",\"8\",\"7\",\"4\",\"1\",\"9\",\"6\",\"3\",\"5\"],\n" +
            "  [\"3\",\"4\",\"5\",\"2\",\"8\",\"6\",\"1\",\"7\",\"9\"]\n" +
            "]";

    @Test
    public void testBoard() {
        char[][] sudoku = matrix(example);
        Solution.Board board = new Solution.Board(sudoku);
        Assert.assertFalse(board.set(0, 2, '5'));
        Assert.assertTrue(board.set(2, 3, '3'));
        Assert.assertFalse(board.set(2, 4, '3'));
        Assert.assertEquals('3', board.charAt(2, 3));
        Assert.assertEquals('5', board.charAt(0, 2));
    }

    @Test
    public void testSolveSudoku() {
        Solution solution = new Solution();

        char[][] sudoku = matrix(example);
        solution.solveSudoku(sudoku);

        dump(sudoku);

        char[][] result = matrix(expected);
        for (int i = 0; i < 9; i++) {
            Assert.assertArrayEquals(sudoku[i], result[i]);
        }
    }


}
