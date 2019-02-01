package site.lvkun.merge_sorted_array;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMerge() {
        Solution solution = new Solution();
        int[] result = array(1,2,3,0,0,0);
        solution.merge(result, 3, array(2,5,6), 3);
        Assert.assertArrayEquals(array(1,2,2,3,5,6), result);
    }
}
