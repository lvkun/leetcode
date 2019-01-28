package site.lvkun.search_in_rotated_sorted_array_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSearch() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.search(array(2,5,6,0,0,1,2), 0));
        Assert.assertFalse(solution.search(array(2,5,6,0,0,1,2), 3));
    }
}
