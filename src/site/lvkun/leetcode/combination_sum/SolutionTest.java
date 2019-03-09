package site.lvkun.leetcode.combination_sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {

    @Test
    public void testCombinationSum() {
        Solution solution = new Solution();
        List<List<Integer>> result1 = solution.combinationSum(array(2,3,6,7), 7);

        Assert.assertEquals(2, result1.size());
        Set<List<Integer>> set1 = new HashSet<>(result1);
        Assert.assertTrue(set1.contains(Arrays.asList(2,2,3)));
        Assert.assertTrue(set1.contains(Arrays.asList(7)));

        List<List<Integer>> result2 = solution.combinationSum(array(2,3,5), 8);
        Assert.assertEquals(3, result2.size());

        Set<List<Integer>> set2 = new HashSet<>(result2);

        Assert.assertTrue(set2.contains(Arrays.asList(2,2,2,2)));
        Assert.assertTrue(set2.contains(Arrays.asList(2,3,3)));
        Assert.assertTrue(set2.contains(Arrays.asList(3,5)));
    }
}
