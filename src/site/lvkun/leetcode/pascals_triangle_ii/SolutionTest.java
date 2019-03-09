package site.lvkun.leetcode.pascals_triangle_ii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testGetRow() {
        Solution solution = new Solution();
        List<Integer> result = solution.getRow(3);
        Assert.assertEquals(Arrays.asList(1,3,3,1), result);
    }
}
