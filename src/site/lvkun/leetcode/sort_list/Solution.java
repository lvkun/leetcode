package site.lvkun.leetcode.sort_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode prev = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;

        return merge(sortList(head), sortList(slow));
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(-1);

        ListNode result = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                result.next = first;
                first = first.next;
            } else {
                result.next = second;
                second = second.next;
            }
            result = result.next;
        }

        if (first != null) {
            result.next = first;
        } else if (second != null) {
            result.next = second;
        }

        return dummy.next;
    }

}
