package site.lvkun.sum_root_to_leaf_numbers;

import site.lvkun.common.TreeNode;

import java.util.Stack;

class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);

        int sum = 0;
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            if (node.left == null && node.right == null) {
                sum += node.val;
                continue;
            }

            if (node.left != null) {
                node.left.val += node.val * 10;
                nodeStack.push(node.left);
            }

            if (node.right != null) {
                node.right.val += node.val * 10;
                nodeStack.push(node.right);
            }
        }

        return sum;
    }
}