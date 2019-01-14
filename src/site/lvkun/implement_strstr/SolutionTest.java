package site.lvkun.implement_strstr;

import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testStrStr() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.strStr("hello", "ll"));
        Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }
}
