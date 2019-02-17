package site.lvkun.path_sum;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class SolutionTest {
    @Test
    public void testHasPathSum() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        Assert.assertTrue(solution.hasPathSum(root, 22));
    }
}
