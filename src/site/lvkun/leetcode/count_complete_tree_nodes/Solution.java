package site.lvkun.leetcode.count_complete_tree_nodes;

import site.lvkun.leetcode.common.TreeNode;

class Solution {
    private int heightLeft(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + heightLeft(node.left);
    }

    private int heightRight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + heightRight(node.right);
    }

    public int countNodes(TreeNode root) {
        int left = heightLeft(root);
        int right = heightRight(root);

        if (left == right) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}