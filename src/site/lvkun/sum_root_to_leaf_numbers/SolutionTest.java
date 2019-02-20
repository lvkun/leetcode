package site.lvkun.sum_root_to_leaf_numbers;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.TreeNode;

public class SolutionTest {
    @Test
    public void testSumNumbers() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Assert.assertEquals(25, solution.sumNumbers(root));

        root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);

        Assert.assertEquals(1026, solution.sumNumbers(root));
    }
}
