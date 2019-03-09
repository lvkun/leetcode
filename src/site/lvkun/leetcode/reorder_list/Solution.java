package site.lvkun.leetcode.reorder_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (mid != null) {
            ListNode next = mid.next;
            mid.next = pre;
            pre = mid;
            mid = next;
        }

        while (head != null && pre != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = pre.next;
            head.next.next = next;
            head = next;
        }
    }
}