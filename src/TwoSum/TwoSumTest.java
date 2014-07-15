package TwoSum;

import junit.framework.TestCase;
import java.util.Arrays;

public class TwoSumTest extends TestCase {
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{1, 2}));
    }
}
