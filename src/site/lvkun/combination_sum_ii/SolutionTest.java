package site.lvkun.combination_sum_ii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testCombinationSum2() {
        Solution solution = new Solution();
        List<List<Integer>> resultList1 = solution.combinationSum2(
                array(10,1,2,7,6,1,5), 8);
        Set<List<Integer>> set1 = new HashSet<>(resultList1);
        Assert.assertEquals(4, resultList1.size());
        Assert.assertTrue(set1.contains(Arrays.asList(1, 7)));
        Assert.assertTrue(set1.contains(Arrays.asList(1, 2, 5)));
        Assert.assertTrue(set1.contains(Arrays.asList(2, 6)));
        Assert.assertTrue(set1.contains(Arrays.asList(1, 1, 6)));

        List<List<Integer>> resultList2 = solution.combinationSum2(
                array(2,5,2,1,2), 5);
        Set<List<Integer>> set2 = new HashSet<>(resultList2);
        Assert.assertEquals(2, resultList2.size());
        Assert.assertTrue(set2.contains(Arrays.asList(1, 2, 2)));
        Assert.assertTrue(set2.contains(Arrays.asList(5)));
    }
}
