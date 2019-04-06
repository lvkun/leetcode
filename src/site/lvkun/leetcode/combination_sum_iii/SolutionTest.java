package site.lvkun.leetcode.combination_sum_iii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testCombinationSum3() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum3(3, 7);

        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1,2,4)
        );

        Assert.assertEquals(expected, result);

        solution.combinationSum3(3, 9);
    }
}
