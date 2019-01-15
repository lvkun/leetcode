package site.lvkun.search_insert_position;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSearchInsert() {
        Solution solution = new Solution();
        Assert.assertEquals(2,
                solution.searchInsert(array(1,3,5,6), 5));
        Assert.assertEquals(1,
                solution.searchInsert(array(1,3,5,6), 2));
        Assert.assertEquals(4,
                solution.searchInsert(array(1,3,5,6), 7));
        Assert.assertEquals(0,
                solution.searchInsert(array(1,3,5,6), 0));

        Assert.assertEquals(1,
                solution.searchInsert(array(1,3), 2));
        Assert.assertEquals(1,
                solution.searchInsert(array(1,3), 3));
        Assert.assertEquals(1,
                solution.searchInsert(array(1,2,3,4,5,10), 2));
    }
}
