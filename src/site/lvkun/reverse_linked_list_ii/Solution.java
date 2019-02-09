package site.lvkun.reverse_linked_list_ii;

import site.lvkun.common.ListNode;

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode m_1th = dummyHead;
        ListNode mth = head;
        int i = 1;
        for (; i < m; i++) {
            m_1th = m_1th.next;
            mth = mth.next;
        }

        ListNode cur = mth.next;
        ListNode prev = mth;
        prev.next = null;
        ListNode next = null;
        for (; i < n; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        m_1th.next = prev;
        mth.next = next;

        return dummyHead.next;
    }
}