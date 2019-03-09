package site.lvkun.leetcode.path_sum_ii;

import site.lvkun.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (root == null) {
            return resultList;
        }

        Stack<Integer> result = new Stack<>();

        pathSum(root, sum, result, resultList);

        return resultList;
    }

    private void pathSum(TreeNode root, int sum,
                         Stack<Integer> result,
                         List<List<Integer>> resultList) {
        result.add(root.val);
        int newSum = sum - root.val;

        if (newSum == 0 && (root.left == null || root.right == null)) {
            resultList.add(new ArrayList<>(result));
            result.pop();
            return;
        }

        if (root.left != null) {
            pathSum(root.left, newSum, result, resultList);
        }
        if (root.right != null) {
            pathSum(root.right, newSum, result, resultList);
        }

        result.pop();
    }
}
