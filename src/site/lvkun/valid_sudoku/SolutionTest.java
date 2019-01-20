package site.lvkun.valid_sudoku;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.matrixChar;

public class SolutionTest {
    @Test
    public void testBoxIndex() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.boxIndex(0, 0));
        Assert.assertEquals(8, solution.boxIndex(8, 8));
        Assert.assertEquals(4, solution.boxIndex(5, 5));
        Assert.assertEquals(1, solution.boxIndex(0, 5));
        Assert.assertEquals(3, solution.boxIndex(4, 0));
    }

    @Test
    public void testIsValidSudoku() {
        Solution solution = new Solution();
        String example1 = "[\n" +
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
        char[][] sudoku1 = matrixChar(example1);
        Assert.assertTrue(solution.isValidSudoku(sudoku1));

        String example2 = "[\n" +
                "  [\"8\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],\n" +
                "  [\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],\n" +
                "  [\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],\n" +
                "  [\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],\n" +
                "  [\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],\n" +
                "  [\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],\n" +
                "  [\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],\n" +
                "  [\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],\n" +
                "  [\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]\n" +
                "]";
        char[][] sudoku2 = matrixChar(example2);
        Assert.assertFalse(solution.isValidSudoku(sudoku2));
    }
}
