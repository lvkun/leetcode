package site.lvkun.leetcode.insertion_sort_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);

        while (head != null) {
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }

            ListNode next = head.next;

            head.next = prev.next;
            prev.next = head;

            head = next;
        }

        return dummy.next;
    }
}