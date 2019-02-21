package site.lvkun.binary_tree_postorder_traversal;

import site.lvkun.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode p = root;

        while (!stack.isEmpty() && p != null) {
            TreeNode node = stack.peek();
            if (node.left == null && node.right == null
                    || node.left == p || node.right == p) {
                result.add(node.val);
                p = node;
                stack.pop();

            } else {
                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }

        return result;
    }
}
