package site.lvkun.leetcode.binary_tree_level_order_traversal_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testLevelOrderBottom() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution.levelOrderBottom(root);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(15, 7),
                Arrays.asList(9, 20),
                Arrays.asList(3)
        );

        Assert.assertEquals(expected, result);
    }
}
