package site.lvkun.multiply_strings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testMultiply() {
        Solution solution = new Solution();
        Assert.assertEquals("6", solution.multiply("3", "2"));
        Assert.assertEquals("56088", solution.multiply("123", "456"));
    }
}
