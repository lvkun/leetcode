package site.lvkun.leetcode.reverse_linked_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;
        ListNode next = cur.next;

        while (next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }

        cur.next = prev;

        return cur;
    }
}