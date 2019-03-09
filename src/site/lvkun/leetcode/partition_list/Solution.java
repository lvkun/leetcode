package site.lvkun.leetcode.partition_list;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode largeDummyHead = new ListNode(0);
        ListNode smallDummyHead = new ListNode(0);

        ListNode largeTail = largeDummyHead;
        ListNode smallTail = smallDummyHead;
        while (head != null) {
            if (head.val >= x) {
                largeTail.next = head;
                largeTail = head;
            } else {
                smallTail.next = head;
                smallTail = head;
            }

            head = head.next;
        }

        smallTail.next = largeDummyHead.next;
        largeTail.next = null;

        return smallDummyHead.next;
    }
}
