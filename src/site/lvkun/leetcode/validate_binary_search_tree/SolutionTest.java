package site.lvkun.leetcode.validate_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

public class SolutionTest {
    @Test
    public void testIsValidBST() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Assert.assertTrue(solution.isValidBST(root));

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        Assert.assertFalse(solution.isValidBST(root));
    }
}
