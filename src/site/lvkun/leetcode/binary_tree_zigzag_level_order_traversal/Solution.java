package site.lvkun.leetcode.binary_tree_zigzag_level_order_traversal;

import site.lvkun.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean leftToRight = true;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        Deque<TreeNode> nextLevel = new ArrayDeque<>();

        List<Integer> levelResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        while (deque.size() > 0) {
            while (deque.size() > 0) {
                TreeNode node = leftToRight? deque.pollFirst() : deque.pollLast();

                levelResult.add(node.val);

                if (node.left != null) {
                    nextLevel.offer(node.left);
                }

                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }

            leftToRight = !leftToRight;

            result.add(new ArrayList<>(levelResult));
            levelResult.clear();

            Deque<TreeNode> temp = deque;
            deque = nextLevel;
            nextLevel = temp;
        }

        return result;
    }
}