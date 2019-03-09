package site.lvkun.leetcode.remove_duplicates_from_sorted_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    private boolean equals(ListNode n1, ListNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }

        return n1.val == n2.val;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode cur = dummy;
        ListNode next = head;

        while (next != null) {
            if (!equals(next.next, next)) {
                cur.next = next;
                cur = next;
            }

            next = next.next;
        }

        return dummy.next;
    }
}
