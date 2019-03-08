package site.lvkun.binary_search_tree_iterator;

import site.lvkun.common.TreeNode;

import java.util.Stack;

class BSTIterator {
    private Stack<TreeNode> treeStack = new Stack<>();
    private TreeNode next;

    public BSTIterator(TreeNode root) {
        next = root;
        while (next.left != null) {
            treeStack.push(next);
            next = next.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = next;

        if (next.right != null) {
            next = next.right;

            while (next.left != null) {
                treeStack.push(next);
                next = next.left;
            }
        } else if (!treeStack.isEmpty()){
            next = treeStack.pop();
        } else {
            next = null;
        }

        return node.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return next != null;
    }
}
