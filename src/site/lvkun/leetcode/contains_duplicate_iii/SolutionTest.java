package site.lvkun.leetcode.contains_duplicate_iii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testContainsNearbyAlmostDuplicate() {
        Solution solution = new Solution();
//        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(
//                array(1,2,3,1), 3, 0
//        ));
        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(
                array(1,0,1,1), 1, 2
        ));
        Assert.assertFalse(solution.containsNearbyAlmostDuplicate(
                array(1,5,9,1,5,9), 2, 3
        ));
    }
}
