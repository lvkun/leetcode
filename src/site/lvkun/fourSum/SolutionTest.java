package site.lvkun.fourSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTest {

    @Test
    public void testFourSum() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        Set<List<Integer>> resultSet = new HashSet<>(result);
        Set<List<Integer>> expectedSet = new HashSet<>(result);

        expectedSet.add(Arrays.asList(-1,  0, 0, 1));
        expectedSet.add(Arrays.asList(-2, -1, 1, 2));
        expectedSet.add(Arrays.asList(-2,  0, 0, 2));

        Assert.assertEquals(expectedSet, resultSet);
    }

}
