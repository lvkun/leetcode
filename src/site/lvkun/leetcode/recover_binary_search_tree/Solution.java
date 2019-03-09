package site.lvkun.leetcode.recover_binary_search_tree;

import site.lvkun.leetcode.common.TreeNode;

// TODO: retry
class Solution {
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode pre = null;
        TreeNode cur = root;

        Visitor visitor = new Visitor() {
            TreeNode first;
            TreeNode second;
            TreeNode parent;

            @Override
            public void onVisit(TreeNode node) {
                if (parent != null && parent.val > node.val) {
                    if (first == null) {
                        first = parent;
                    }
                    second = node;
                }

                parent = node;
            }

            @Override
            public void onFinish() {
                swap(first, second);
            }
        };

        while (cur != null) {
            if (cur.left == null) {
                visitor.onVisit(cur);
                cur = cur.right;
            } else {
                pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;

                    visitor.onVisit(cur);

                    cur = cur.right;
                }
            }
        }

        visitor.onFinish();
    }

    private void swap(TreeNode first, TreeNode second) {
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    interface Visitor {
        void onVisit(TreeNode node);
        void onFinish();
    }
}