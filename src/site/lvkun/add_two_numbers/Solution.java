package site.lvkun.add_two_numbers;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import site.lvkun.common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode cur = null;

        while (l1 != null || l2 != null) {
            int sum = getVal(l1) + getVal(l2) + carry;
            int num = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(num);

            if (head == null) {
                head = node;
                cur = head;
            } else {
                cur.next = node;
                cur = node;
            }

            l1 = getNext(l1);
            l2 = getNext(l2);
        }

        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return head;
    }

    private int getVal(ListNode listNode) {
        if (listNode == null) {
            return 0;
        }
        return listNode.val;
    }

    private ListNode getNext(ListNode listNode) {
        if (listNode == null) {
            return null;
        }

        return listNode.next;
    }
}
