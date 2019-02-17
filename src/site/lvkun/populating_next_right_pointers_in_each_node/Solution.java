package site.lvkun.populating_next_right_pointers_in_each_node;

import site.lvkun.common.Node;

// TODO: retry
class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node start = root;

        while (start.left != null) {
            Node cur = start;

            while (cur != null) {
                cur.left.next = cur.right;

                if (cur.next != null) {
                    cur.right.next = cur.next.left;
                }

                cur = cur.next;
            }


            start = start.left;
        }


        return root;
    }
}