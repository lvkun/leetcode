package site.lvkun.leetcode.contains_duplicate;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testContainsDuplicate() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.containsDuplicate(array(1,2,3,1)));
        Assert.assertFalse(solution.containsDuplicate(array(1,2,3,4)));
        Assert.assertTrue(solution.containsDuplicate(array(1,1,1,3,3,4,3,2,4,2)));
    }
}
