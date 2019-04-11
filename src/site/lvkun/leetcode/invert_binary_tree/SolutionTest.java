package site.lvkun.leetcode.invert_binary_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

public class SolutionTest {
    @Test
    public void testInvertTree() {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(7);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(9);

        Solution solution = new Solution();
        node = solution.invertTree(node);

        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);
        expected.right = new TreeNode(2);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        Assert.assertEquals(expected, node);
    }
}
