package site.lvkun.leetcode.permutations;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testPermute() {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.permute(array(1,2,3));
        Assert.assertEquals(6, resultList.size());

        Assert.assertEquals(Arrays.asList(1,2,3), resultList.get(0));
        Assert.assertEquals(Arrays.asList(1,3,2), resultList.get(1));
        Assert.assertEquals(Arrays.asList(2,1,3), resultList.get(2));
        Assert.assertEquals(Arrays.asList(2,3,1), resultList.get(3));
        Assert.assertEquals(Arrays.asList(3,2,1), resultList.get(4));
        Assert.assertEquals(Arrays.asList(3,1,2), resultList.get(5));
    }
}
