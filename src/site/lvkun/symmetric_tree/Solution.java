package site.lvkun.symmetric_tree;

import site.lvkun.common.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null) {
            return isSymmetric(left.left, right.right)
                    && isSymmetric(left.right, right.left);
        }

        return false;
    }
}