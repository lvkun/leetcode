package site.lvkun.TwoSum;

import junit.framework.TestCase;
import java.util.Arrays;

public class TwoSumTest extends TestCase {
    public void testTwoSum() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{1, 2}));
    }
}
