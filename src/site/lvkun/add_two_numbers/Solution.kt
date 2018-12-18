package site.lvkun.add_two_numbers

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

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null

    override fun toString(): String {
        if (next != null) {
            return `val`.toString() + " -> " + next
        }

        return `val`.toString()
    }
}

class Solution {


    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head: ListNode? = null
        var cur: ListNode? = null
        var carry = 0

        var node1 = l1
        var node2 = l2

        while (node1 != null || node2 != null) {
            val v1 = node1?.`val` ?: 0
            val v2 = node2?.`val` ?: 0

            val sum = v1 + v2 + carry
            val v = sum % 10
            carry = sum / 10

            val node = ListNode(v)
            if (head == null) {
                head = node
                cur = head
            } else {
                cur?.next = node
                cur = node
            }

            node1 = node1?.next
            node2 = node2?.next
        }

        return head
    }
}
