package site.lvkun.binary_tree_maximum_path_sum;

import site.lvkun.common.TreeNode;

class Solution {
    private int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = 0;

        maxPathSumInner(root);

        return maxPathSum;
    }

    private int maxPathSumInner(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(maxPathSumInner(node.left), 0);
        int right = Math.max(maxPathSumInner(node.right), 0);

        maxPathSum = Math.max(maxPathSum, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}
