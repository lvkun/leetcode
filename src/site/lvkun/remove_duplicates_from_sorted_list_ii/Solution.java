package site.lvkun.remove_duplicates_from_sorted_list_ii;

import site.lvkun.common.ListNode;

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

        ListNode list = dummy;
        ListNode prev = dummy;
        ListNode next = prev.next;
        while (next != null) {
            if (!equals(next, next.next) && !equals(prev, next)) {
                list.next = next;
                list = next;
            }

            prev = next;
            next = next.next;
        }

        return dummy.next;
    }
}
