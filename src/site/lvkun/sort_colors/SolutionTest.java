package site.lvkun.sort_colors;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSortColors() {
        Solution solution = new Solution();
        int[] result = array(2,0,2,1,1,0);
        solution.sortColors(result);

        Assert.assertArrayEquals(array(0,0,1,1,2,2),
                result);
    }
}
