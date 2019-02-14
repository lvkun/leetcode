package site.lvkun.common;

import java.util.List;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        Stack<String> result = new Stack<>();

        result.add(String.valueOf(val));
        appendToList(this, result);

        while (result.peek().equals("null")) {
            result.pop();
        }

        return "[" + String.join(",", result) + "]";
    }

    private static void appendToList(TreeNode treeNode, List<String> result) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.left == null) {
            result.add("null");
        } else {
            result.add(String.valueOf(treeNode.left.val));
        }

        if (treeNode.right == null) {
            result.add("null");
        } else {
            result.add(String.valueOf(treeNode.right.val));
        }

        appendToList(treeNode.left, result);
        appendToList(treeNode.right, result);
    }

}
