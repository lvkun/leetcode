package site.lvkun.leetcode.n_queens_ii;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testTotalNQueens() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.totalNQueens(4));
    }
}
