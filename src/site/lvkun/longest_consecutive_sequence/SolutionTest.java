package site.lvkun.longest_consecutive_sequence;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testLongestConsecutive() {
        Solution solution = new Solution();
        Assert.assertEquals(4,
                solution.longestConsecutive(array(100, 4, 200, 1, 3, 2)));
    }
}
