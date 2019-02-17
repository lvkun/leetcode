package site.lvkun.flatten_binary_tree_to_linked_list;

import site.lvkun.common.TreeNode;

// TODO: retry
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode p = cur.left;
                while (p.right != null) {
                    p = p.right;
                }

                p.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }

            cur = cur.right;
        }
    }
}
