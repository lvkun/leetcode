package site.lvkun.longest_palindromic_substring

import org.junit.Assert
import org.junit.Test


class SolutionTest {

    @Test
    fun testLongestPalindrome() {
        val solution = Solution()

        val range = PalindromeRange("babad", 1, 1)
        Assert.assertEquals(range.toString(), "bab")

        Assert.assertEquals("bab", solution.longestPalindrome("babad"))
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"))
    }
}