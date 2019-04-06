package site.lvkun.leetcode.contains_duplicate_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testContainsNearbyDuplicate() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.containsNearbyDuplicate(array(1,2,3,1), 3));
        Assert.assertTrue(solution.containsNearbyDuplicate(array(1,0,1,1), 1));
        Assert.assertFalse(solution.containsNearbyDuplicate(array(1,2,3,1,2,3), 2));
    }
}
