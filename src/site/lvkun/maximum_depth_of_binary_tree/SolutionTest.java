package site.lvkun.maximum_depth_of_binary_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class SolutionTest {
    @Test
    public void testMaxDepth() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(3, solution.maxDepth(root));
    }
}
