package site.lvkun.integer_to_roman;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testIntToRoman() {
        Solution solution = new Solution();
        Assert.assertEquals("III", solution.intToRoman(3));
        Assert.assertEquals("IV", solution.intToRoman(4));
        Assert.assertEquals("IX", solution.intToRoman(9));
        Assert.assertEquals("LVIII", solution.intToRoman(58));
        Assert.assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}
