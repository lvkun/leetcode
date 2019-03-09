package site.lvkun.leetcode.two_sum_ii_input_array_is_sorted;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(array(2,7,11,15), 9);
        Assert.assertArrayEquals(array(1, 2), result);
    }
}
