package site.lvkun.leetcode.zigzag_conversion;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testConversion() {
        Solution solution = new Solution();
        String answer3 = solution.convert("PAYPALISHIRING", 3);
        String answer4 = solution.convert("PAYPALISHIRING", 4);

        Assert.assertEquals("PAHNAPLSIIGYIR", answer3);
        Assert.assertEquals("PINALSIGYAHRPI", answer4);
    }
}
