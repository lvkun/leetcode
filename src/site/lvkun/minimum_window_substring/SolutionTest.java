package site.lvkun.minimum_window_substring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMinWindow() {
        Solution solution = new Solution();
        Assert.assertEquals("BANC",
                solution.minWindow("ADOBECODEBANC", "ABC"));
    }
}
