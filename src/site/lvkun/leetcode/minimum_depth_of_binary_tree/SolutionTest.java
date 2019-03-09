package site.lvkun.leetcode.minimum_depth_of_binary_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

public class SolutionTest {
    @Test
    public void testMinDepth() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(2, solution.minDepth(root));
    }
}
