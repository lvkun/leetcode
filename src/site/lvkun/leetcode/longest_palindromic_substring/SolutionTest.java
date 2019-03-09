package site.lvkun.leetcode.longest_palindromic_substring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLongestPalindrome() {
        Solution solution = new Solution();

        Solution.Range range = Solution.Range.create("babad", 1, 1);
        Assert.assertEquals(range.toString(), "bab");

        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
    }
}
