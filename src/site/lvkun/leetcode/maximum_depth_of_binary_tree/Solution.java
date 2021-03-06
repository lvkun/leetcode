package site.lvkun.leetcode.maximum_depth_of_binary_tree;

import site.lvkun.leetcode.common.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}