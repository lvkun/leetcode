package site.lvkun.subsets_ii;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static site.lvkun.common.ArrayUtils.array;
import static site.lvkun.common.ArrayUtils.from;

public class SolutionTest {
    @Test
    public void testSubsetsWithDup() {
        Solution solution = new Solution();
        List<List<Integer>> resultList
                = solution.subsetsWithDup(array(1,2,2));
        List<List<Integer>> expectedList = from("[\n" +
                "  [2],\n" +
                "  [1],\n" +
                "  [1,2,2],\n" +
                "  [2,2],\n" +
                "  [1,2],\n" +
                "  []\n" +
                "]");
        Set<List<Integer>> resultSet = new HashSet<>(resultList);
        Set<List<Integer>> expectedSet = new HashSet<>(expectedList);
        Assert.assertEquals(expectedSet, resultSet);
    }
}
