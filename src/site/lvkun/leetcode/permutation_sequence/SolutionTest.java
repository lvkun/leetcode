package site.lvkun.leetcode.permutation_sequence;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testPermutation() {
        Solution solution = new Solution();
        Assert.assertEquals("213", solution.getPermutation(3, 3));
        Assert.assertEquals("2314", solution.getPermutation(4, 9));
    }
}
