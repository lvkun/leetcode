package site.lvkun.leetcode.copy_list_with_random_pointer;

import site.lvkun.leetcode.common.RandomListNode;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;

        while (cur != null) {
            RandomListNode copy = new RandomListNode(cur.label);
            copy.next = cur.next;
            cur.next = copy;
            cur = cur.next.next;
        }

        cur = head;
        while (cur != null) {
            cur.next.random = cur.random.next;
            cur = cur.next.next;
        }

        cur = head;
        RandomListNode newHead = head.next;
        while (cur != null) {
            RandomListNode temp = cur.next;
            cur.next = temp.next;

            if (temp.next != null) {
                temp.next = temp.next.next;
            }

            cur = cur.next;
        }

        return newHead;
    }
}