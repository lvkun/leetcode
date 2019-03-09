package site.lvkun.leetcode.combinations;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static site.lvkun.leetcode.common.ArrayUtils.from;

public class SolutionTest {

    @Test
    public void testCombine() {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.combine(4, 2);
        Set<List<Integer>> resultSet = new HashSet<>(resultList);
        List<List<Integer>> expectedList = from("[\n" +
                "  [2,4],\n" +
                "  [3,4],\n" +
                "  [2,3],\n" +
                "  [1,2],\n" +
                "  [1,3],\n" +
                "  [1,4],\n" +
                "]");
        Set<List<Integer>> expected = new HashSet<>(expectedList);
        Assert.assertEquals(expected, resultSet);
    }
}
