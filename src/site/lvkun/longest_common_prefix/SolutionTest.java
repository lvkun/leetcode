package site.lvkun.longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLongestCommonPrefix() {
        Solution solution = new Solution();

        Assert.assertEquals("fl",
                solution.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        Assert.assertEquals("",
                solution.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}
