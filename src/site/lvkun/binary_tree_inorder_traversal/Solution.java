package site.lvkun.binary_tree_inorder_traversal;

import site.lvkun.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode curNode = root;
        while (curNode != null || nodeStack.size() > 0) {
            while (curNode != null) {
                nodeStack.add(curNode);
                curNode = curNode.left;
            }

            curNode = nodeStack.pop();
            result.add(curNode.val);
            curNode = curNode.right;
        }

        return result;
    }
}