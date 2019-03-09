package site.lvkun.leetcode.convert_sorted_array_to_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testSortedArrayToBST() {
        Solution solution = new Solution();
        TreeNode result = solution.sortedArrayToBST(array(-10,-3,0,5,9));
        Assert.assertEquals("[0,-3,9,-10,null,5]", result.toString());
    }
}
