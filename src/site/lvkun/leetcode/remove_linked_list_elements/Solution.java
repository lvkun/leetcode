package site.lvkun.leetcode.remove_linked_list_elements;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }

        }

        return dummyHead.next;
    }
}
