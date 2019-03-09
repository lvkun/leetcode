package site.lvkun.leetcode.distinct_subsequences;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testNumDistinct() {
        Solution solution = new Solution();
        Assert.assertEquals(3,
                solution.numDistinct("rabbbit", "rabbit"));
        Assert.assertEquals(5,
                solution.numDistinct("babgbag", "bag"));
    }
}
