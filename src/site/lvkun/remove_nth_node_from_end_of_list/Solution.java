package site.lvkun.remove_nth_node_from_end_of_list;

class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;

        int i = 0;
        while (i < n - 1) {
            end = end.next;
            i++;
        }

        ListNode nth = head;
        ListNode prev = head;

        while (end.next != null) {
            end = end.next;
            prev = nth;
            nth = nth.next;
        }

        if (nth.next == null) {
            prev.next = null;
        } else {
            nth.val = nth.next.val;
            nth.next = nth.next.next;
        }

        return head;
    }
}
