package site.lvkun.binary_tree_postorder_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testPostorderTraversal() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result  = solution.postorderTraversal(root);
        Assert.assertEquals(Arrays.asList(3,2,1), result);
    }
}
