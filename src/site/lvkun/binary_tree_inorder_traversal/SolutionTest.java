package site.lvkun.binary_tree_inorder_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

import java.util.Arrays;
import java.util.List;

// TODO: retry
public class SolutionTest {
    @Test
    public void testInorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);
        Assert.assertEquals(Arrays.asList(1, 3, 2), result);
    }
}
