package site.lvkun.unique_binary_search_trees;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testNumTrees() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.numTrees(3));
    }
}
