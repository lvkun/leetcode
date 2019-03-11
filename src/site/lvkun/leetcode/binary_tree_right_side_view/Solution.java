package site.lvkun.leetcode.binary_tree_right_side_view;

import site.lvkun.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        Queue<TreeNode> nextLevel = new ArrayDeque<>();

        while (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (queue.isEmpty()) {
                    result.add(node.val);
                }

                if (node.left != null) {
                    nextLevel.offer(node.left);
                }

                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }

            queue = nextLevel;
            nextLevel = new ArrayDeque<>();
        }


        return result;
    }
}
