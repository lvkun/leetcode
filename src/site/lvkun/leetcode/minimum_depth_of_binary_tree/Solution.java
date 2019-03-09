package site.lvkun.leetcode.minimum_depth_of_binary_tree;

import site.lvkun.leetcode.common.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}