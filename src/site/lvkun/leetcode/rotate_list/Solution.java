package site.lvkun.leetcode.rotate_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // find last two
        ListNode tail = head;
        for (int i = 0; i < k - 1; i++) {
            if (tail.next != null) {
                tail = tail.next;
            } else {
                tail = head;
            }
        }

        ListNode kth = head;
        ListNode kprev = head;
        while (tail.next != null) {
            tail = tail.next;
            kprev = kth;
            kth = kth.next;
        }

        tail.next = head;
        kprev.next = null;
        return kth;
    }
}