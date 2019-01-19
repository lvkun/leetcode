package site.lvkun.permutations_ii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testPermute() {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.permute(array(1,1,2));
        Assert.assertEquals(3, resultList.size());
        Assert.assertEquals(Arrays.asList(1,1,2), resultList.get(0));
        Assert.assertEquals(Arrays.asList(1,2,1), resultList.get(1));
        Assert.assertEquals(Arrays.asList(2,1,1), resultList.get(2));
    }
}
