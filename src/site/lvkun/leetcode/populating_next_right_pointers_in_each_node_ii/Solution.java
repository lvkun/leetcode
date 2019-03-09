package site.lvkun.leetcode.populating_next_right_pointers_in_each_node_ii;

import site.lvkun.leetcode.common.Node;

// TODO: retry
class Solution {
    public Node connect(Node root) {
        Node dummy = new Node();
        Node cur = dummy;

        Node start = root;
        while (start != null) {
            if (start.left != null) {
                cur.next = start.left;
                cur = cur.next;
            }

            if (start.right != null) {
                cur.next = start.right;
                cur = cur.next;
            }

            start = start.next;

            if (start == null) {
                cur = dummy;
                start = dummy.next;
                dummy.next = null;
            }
        }

        return root;
    }
}