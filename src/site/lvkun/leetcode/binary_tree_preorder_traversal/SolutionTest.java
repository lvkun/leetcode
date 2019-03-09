package site.lvkun.leetcode.binary_tree_preorder_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testPreorderTraversal() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result  = solution.preorderTraversal(root);
        Assert.assertEquals(Arrays.asList(1,2,3), result);
    }
}
