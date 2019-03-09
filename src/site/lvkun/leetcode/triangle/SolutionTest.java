package site.lvkun.leetcode.triangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testMinimumTotal() {
        Solution solution = new Solution();

        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,2)
        );

        Assert.assertEquals(11, solution.minimumTotal(triangle));
    }
}
