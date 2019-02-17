package site.lvkun.balanced_binary_tree;

import site.lvkun.common.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }

    private int checkDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = checkDepth(node.left);
        if (left == -1) {
            return -1;
        }

        int right = checkDepth(node.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(right - left) <= 1) {
            return 1 + Math.max(right, left);
        }

        return -1;
    }
}