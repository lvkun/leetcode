package site.lvkun.leetcode.recover_binary_search_tree;

import org.junit.Test;
import site.lvkun.leetcode.common.TreeNode;

public class SolutionTest {
    @Test
    public void testRecoverTree() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        solution.recoverTree(root);

        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        solution.recoverTree(root);
    }
}
