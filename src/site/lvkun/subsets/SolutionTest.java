package site.lvkun.subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static site.lvkun.common.ArrayUtils.array;
import static site.lvkun.common.ArrayUtils.from;

public class SolutionTest {
    @Test
    public void testSubsets() {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.subsets(array(1,2,3));
        Set<List<Integer>> resultSet = new HashSet<>(resultList);
        List<List<Integer>> expectedList = from("[\n" +
                "  [3],\n" +
                "  [1],\n" +
                "  [2],\n" +
                "  [1,2,3],\n" +
                "  [1,3],\n" +
                "  [2,3],\n" +
                "  [1,2],\n" +
                "  []\n" +
                "]");
        Set<List<Integer>> expected = new HashSet<>(expectedList);
        Assert.assertEquals(expected, resultSet);
    }
}
