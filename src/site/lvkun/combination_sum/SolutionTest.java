package site.lvkun.combination_sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {

    @Test
    public void testCombinationSum() {
        Solution solution = new Solution();
        List<List<Integer>> result1 = solution.combinationSum(array(2,3,6,7), 7);

        Assert.assertEquals(2, result1.size());
        Assert.assertEquals(Arrays.asList(2,2,3), result1.get(0));
        Assert.assertEquals(Arrays.asList(7), result1.get(1));

        List<List<Integer>> result2 = solution.combinationSum(array(2,3,5), 8);

        Assert.assertEquals(3, result2.size());
        Assert.assertEquals(Arrays.asList(2,2,2,2), result2.get(0));
        Assert.assertEquals(Arrays.asList(2,3,3), result2.get(1));
        Assert.assertEquals(Arrays.asList(3,5), result2.get(2));

    }
}
