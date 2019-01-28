package site.lvkun.word_search;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.matrixChar;

public class SolutionTest {

    @Test
    public void testExist() {
        Solution solution = new Solution();
        char[][] board = matrixChar("[\n" +
                "  ['A','B','C','E'],\n" +
                "  ['S','F','C','S'],\n" +
                "  ['A','D','E','E']\n" +
                "]\n");
        Assert.assertTrue(solution.exist(board, "ABCCED"));
        Assert.assertTrue(solution.exist(board, "SEE"));
        Assert.assertFalse(solution.exist(board, "ABCB"));
    }
}
