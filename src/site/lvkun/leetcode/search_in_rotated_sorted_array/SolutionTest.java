package site.lvkun.leetcode.search_in_rotated_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSearch() {
        Solution solution = new Solution();
        Assert.assertEquals(4,
                solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        Assert.assertEquals(-1,
                solution.search(new int[]{4,5,6,7,0,1,2}, 3));
        Assert.assertEquals(2,
                solution.search(new int[]{5,1,3}, 3));
    }
}
