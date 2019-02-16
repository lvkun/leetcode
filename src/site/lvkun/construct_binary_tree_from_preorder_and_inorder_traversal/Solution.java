package site.lvkun.construct_binary_tree_from_preorder_and_inorder_traversal;

import site.lvkun.common.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }

        if (preorder.length != inorder.length) {
            return null;
        }

        Range pre = new Range(preorder, 0, preorder.length);
        Range in = new Range(inorder, 0, inorder.length);

        return buildTree(pre, in);
    }

    private TreeNode buildTree(Range preorder, Range inorder) {
        if (preorder.size() == 0) {
            return null;
        }

        int v = preorder.valueAt(preorder.start);
        int i = inorder.find(v);

        Range leftInorder = inorder.subRange(inorder.start, i);
        Range rightInorder = inorder.subRange(i + 1, inorder.end);
        Range leftPreorder = preorder.subRange(preorder.start + 1,
                preorder.start + 1 + leftInorder.size());
        Range rightPreorder = preorder.subRange(preorder.start + 1 + leftInorder.size(),
                preorder.start + 1 + leftInorder.size() + rightInorder.size());

        TreeNode node = new TreeNode(v);
        node.left = buildTree(leftPreorder, leftInorder);
        node.right = buildTree(rightPreorder, rightInorder);

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
