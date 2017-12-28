package site.lvkun.two_sum;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{0, 1}));

        result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertTrue(Arrays.equals(result, new int[]{1, 2}));

        result = solution.twoSum(new int[]{3, 3}, 6);
        assertTrue(Arrays.equals(result, new int[]{0, 1}));
    }
}
