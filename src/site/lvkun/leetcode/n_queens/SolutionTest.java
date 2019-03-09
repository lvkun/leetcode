package site.lvkun.leetcode.n_queens;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testSolveNQueens() {
        Solution solution = new Solution();
        List<List<String>> resultList = solution.solveNQueens(4);

        Assert.assertEquals(2, resultList.size());
        Assert.assertEquals(Arrays.asList(
                ".Q..",
                "...Q",
                "Q...",
                "..Q."),
                resultList.get(0));
        Assert.assertEquals(Arrays.asList(
                "..Q.",
                "Q...",
                "...Q",
                ".Q.."),
                resultList.get(1));
    }
}
