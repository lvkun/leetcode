package site.lvkun.leetcode.common;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    private static TreeNode NULL = new TreeNode(-1);

    @Override
    public String toString() {
        Stack<String> result = new Stack<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(this);

        while (queue.size() > 0) {
            TreeNode node = queue.poll();

            if (node != NULL) {
                result.add(String.valueOf(node.val));
            } else {
                result.add("null");
                continue;
            }

            if (node.left != null) {
                queue.offer(node.left);
            } else {
                queue.offer(NULL);
            }
            if (node.right != null) {
                queue.offer(node.right);
            } else {
                queue.offer(NULL);
            }
        }

        while (result.peek().equals("null")) {
            result.pop();
        }

        return "[" + String.join(",", result) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof TreeNode)) {
            return false;
        }

        TreeNode other = (TreeNode) obj;
        return nodeEquals(this, other);
    }

    private boolean nodeEquals(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 != null && n2 != null) {
            return n1.val == n2.val
                    && nodeEquals(n1.left, n2.left)
                    && nodeEquals(n1.right, n2.right);
        }

        return false;
    }
}
