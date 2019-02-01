package site.lvkun.scramble_string;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsScramble() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isScramble("great", "rgeat"));
        Assert.assertFalse(solution.isScramble("abcde", "caebd"));
    }
}
