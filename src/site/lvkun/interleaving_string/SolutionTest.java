package site.lvkun.interleaving_string;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsInterleave() {
        Solution solution = new Solution();

        Assert.assertTrue(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertFalse(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
