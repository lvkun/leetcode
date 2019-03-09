package site.lvkun.leetcode.excel_sheet_column_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testTitleToNumber() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.titleToNumber("A"));
        Assert.assertEquals(28, solution.titleToNumber("AB"));
        Assert.assertEquals(701, solution.titleToNumber("ZY"));
    }
}
