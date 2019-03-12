package site.lvkun.leetcode.isomorphic_strings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsIsomorphic() {
        Solution solution = new Solution();
//        Assert.assertTrue(solution.isIsomorphic("egg", "add"));
//        Assert.assertFalse(solution.isIsomorphic("foo", "bar"));
//        Assert.assertTrue(solution.isIsomorphic("paper", "title"));
        Assert.assertFalse(solution.isIsomorphic("ab", "aa"));
    }
}
