package site.lvkun.leetcode.convert_sorted_list_to_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;
import site.lvkun.leetcode.common.TreeNode;

public class SolutionTest {
    @Test
    public void testSortedListToBST() {
        Solution solution = new Solution();
        TreeNode result = solution.sortedListToBST(ListNode.fromString("-10->-3->0->5->9"));
        Assert.assertEquals("[0,-3,9,-10,null,5]", result.toString());
    }
}
