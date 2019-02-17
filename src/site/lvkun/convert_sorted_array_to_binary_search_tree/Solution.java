package site.lvkun.convert_sorted_array_to_binary_search_tree;

import site.lvkun.common.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }

        return sortedArrayToBST(nums, 0, nums.length);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBST(nums, start, mid);
        node.right = sortedArrayToBST(nums, mid + 1, end);

        return node;
    }
}