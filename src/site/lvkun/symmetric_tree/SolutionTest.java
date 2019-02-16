package site.lvkun.symmetric_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class SolutionTest {
    @Test
    public void testIsSymmetric() {
        Solution solution = new Solution();
        TreeNode root;

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Assert.assertTrue(solution.isSymmetric(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        Assert.assertFalse(solution.isSymmetric(root));
    }
}
