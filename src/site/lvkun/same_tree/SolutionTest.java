package site.lvkun.same_tree;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class SolutionTest {
    @Test
    public void testSameTree() {
        TreeNode node1;
        TreeNode node2;

        Solution solution = new Solution();

        node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(3);

        node2 = new TreeNode(1);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(3);

        Assert.assertTrue(solution.isSameTree(node1, node2));

        node1 = new TreeNode(1);
        node1.left = new TreeNode(2);

        node2 = new TreeNode(1);
        node2.right = new TreeNode(2);

        Assert.assertFalse(solution.isSameTree(node1, node2));

        node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(1);

        node2 = new TreeNode(1);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(2);

        Assert.assertFalse(solution.isSameTree(node1, node2));
    }
}
