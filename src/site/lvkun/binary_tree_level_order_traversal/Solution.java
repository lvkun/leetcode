package site.lvkun.binary_tree_level_order_traversal;

import site.lvkun.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        List<Integer> levelResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> nextLevel = new ArrayDeque<>();

        while (queue.size() > 0) {
            while (queue.size() > 0) {
                TreeNode node = queue.poll();

                levelResult.add(node.val);

                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }

            result.add(new ArrayList<>(levelResult));
            levelResult.clear();

            Queue<TreeNode> temp = nextLevel;
            nextLevel = queue;
            queue = temp;
        }

        return result;
    }
}
