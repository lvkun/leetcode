package site.lvkun.leetcode.construct_binary_tree_from_inorder_and_postorder_traversal;

import site.lvkun.leetcode.common.TreeNode;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }

        if (inorder.length != postorder.length) {
            return null;
        }

        Range in = new Range(inorder, 0, inorder.length);
        Range post = new Range(postorder, 0, postorder.length);

        return buildTree(in, post);
    }

    private TreeNode buildTree(Range inorder, Range postorder) {
        if (postorder.size() == 0) {
            return null;
        }

        int v = postorder.valueAt(postorder.end - 1);
        int i = inorder.find(v);

        Range leftInorder = inorder.subRange(inorder.start, i);
        Range rightInorder = inorder.subRange(i + 1, inorder.end);

        Range leftPostorder = postorder.subRange(postorder.start, postorder.start + leftInorder.size());
        Range rightPostorder = postorder.subRange(postorder.start + leftInorder.size(), postorder.end - 1);

        TreeNode node = new TreeNode(v);
        node.left = buildTree(leftInorder, leftPostorder);
        node.right = buildTree(rightInorder, rightPostorder);

        return node;
    }

    private static class Range {
        int[] data;
        int start;
        int end;

        public Range(int[] data, int start, int end) {
            this.data = data;
            this.start = start;
            this.end = end;
        }

        public int size() {
            return end - start;
        }

        public Range subRange(int newStart, int newEnd) {
            Range sub = new Range(this.data, newStart, newEnd);
            return sub;
        }

        public int valueAt(int index) {
            return data[index];
        }

        public int find(int value) {
            for (int i = start; i < end; i++) {
                if (data[i] == value) {
                    return i;
                }
            }

            return -1;
        }
    }
}