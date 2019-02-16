package site.lvkun.binary_tree_zigzag_level_order_traversal;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testZigzagLevelOrder() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20, 9),
                Arrays.asList(15, 7)
        );

        Assert.assertEquals(expected, result);
    }
}
