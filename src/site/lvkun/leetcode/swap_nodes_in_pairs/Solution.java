package site.lvkun.leetcode.swap_nodes_in_pairs;

import site.lvkun.leetcode.common.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode others = second.next;

        second.next = first;
        first.next = swapPairs(others);

        return second;
    }
}