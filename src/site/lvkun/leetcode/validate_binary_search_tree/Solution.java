package site.lvkun.leetcode.validate_binary_search_tree;

import site.lvkun.leetcode.common.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val > max || node.val < min) {
            return false;
        }

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
