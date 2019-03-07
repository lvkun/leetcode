package site.lvkun.excel_sheet_column_title;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testConvertToTitle() {
        Solution solution = new Solution();
        Assert.assertEquals("A", solution.convertToTitle(1));
        Assert.assertEquals("AB", solution.convertToTitle(28));
        Assert.assertEquals("ZY", solution.convertToTitle(701));
    }
}
