package site.lvkun.intersection_of_two_linked_lists;

import site.lvkun.common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lA = getLength(headA);
        int lB = getLength(headB);

        if (lA > lB) {
            int delta = lA - lB;
            while (delta > 0) {
                headA = headA.next;
                delta--;
            }
        } else {
            int delta = lB - lA;
            while (delta > 0) {
                headB = headB.next;
                delta--;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}