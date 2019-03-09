package site.lvkun.leetcode.reverse_nodes_in_k_group;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        int i = 0;
        while (i < k - 1) {
            if (tail.next == null) {
                return head;
            }
            tail = tail.next;
            i++;
        }

        ListNode nextGroup = tail.next;
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(nextGroup, k);
        return newHead;
    }

    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode cur = head;
        ListNode post = cur.next;
        while (cur != tail) {
            ListNode t = post.next;
            post.next = cur;
            cur = post;
            post = t;
        }

        return tail;
    }
}