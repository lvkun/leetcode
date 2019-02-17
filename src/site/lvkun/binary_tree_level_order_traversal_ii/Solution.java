package site.lvkun.binary_tree_level_order_traversal_ii;

import site.lvkun.common.TreeNode;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        List<Integer> levelResult = new ArrayList<>();
        LinkedList<List<Integer>> result = new LinkedList<>();

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

            result.addFirst(new ArrayList<>(levelResult));
            levelResult.clear();

            Queue<TreeNode> temp = nextLevel;
            nextLevel = queue;
            queue = temp;
        }

        return result;
    }
}