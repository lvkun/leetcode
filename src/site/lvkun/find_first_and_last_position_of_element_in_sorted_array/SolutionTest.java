package site.lvkun.find_first_and_last_position_of_element_in_sorted_array;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSearchRange() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(array(3,4),
                solution.searchRange(array(5,7,7,8,8,10), 8));
        Assert.assertArrayEquals(array(-1,-1),
                solution.searchRange(array(5,7,7,8,8,10), 6));
    }
}
