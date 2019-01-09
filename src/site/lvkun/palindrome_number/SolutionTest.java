package site.lvkun.palindrome_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testIsPalindrome() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isPalindrome(121));
        Assert.assertFalse(solution.isPalindrome(-121));
        Assert.assertFalse(solution.isPalindrome(10));
    }
}
