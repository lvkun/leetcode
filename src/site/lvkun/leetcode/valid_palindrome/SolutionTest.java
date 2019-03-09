package site.lvkun.leetcode.valid_palindrome;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsPalindrome() {
        Solution solution = new Solution();
        Assert.assertTrue(
                solution.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(
                solution.isPalindrome("race a car"));
    }
}
