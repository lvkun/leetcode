package site.lvkun.leetcode.unique_binary_search_trees_ii;

import site.lvkun.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();

        if (n == 0) {
            return result;
        }

        generateTrees(1, n, result);

        return result;
    }

    private void generateTrees(int start, int end, List<TreeNode> result) {
        if (start == end) {
            result.add(new TreeNode(start));
            return;
        }

        if (start > end) {
            result.add(new TreeNode(-1));
            return;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> treeNodeListLeft = new ArrayList<>();
            generateTrees(start, i - 1, treeNodeListLeft);
            List<TreeNode> treeNodeListRight = new ArrayList<>();
            generateTrees(i + 1, end, treeNodeListRight);


            for (TreeNode left : treeNodeListLeft) {
                for (TreeNode right: treeNodeListRight) {
                    TreeNode curNode = new TreeNode(i);
                    if (left.val != -1) {
                        curNode.left = left;
                    }
                    if (right.val != -1) {
                        curNode.right = right;
                    }

                    result.add(curNode);
                }
            }
        }
    }
}