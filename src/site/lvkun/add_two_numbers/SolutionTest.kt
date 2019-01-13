package site.lvkun.add_two_numbers

import org.junit.Assert
import org.junit.Test
import site.lvkun.common.ListNode

class SolutionTest {

    @Test
    fun testListNode() {
        val node = ListNode.fromString("2->4->3")
        Assert.assertEquals("2->4->3", node.toString())
    }

    @Test
    fun testAddTwoNumbers() {
        val solution = Solution()
        Assert.assertEquals("7->0->8",
                solution.addTwoNumbers(
                        ListNode.fromString("2->4->3"),
                        ListNode.fromString("5->6->4")).toString())
        Assert.assertEquals("7",
                solution.addTwoNumbers(
                        ListNode.fromString("2"),
                        ListNode.fromString("5")).toString())
        Assert.assertEquals("0->1",
                solution.addTwoNumbers(
                        ListNode.fromString("5"),
                        ListNode.fromString("5")).toString())
        Assert.assertEquals("7->0->5",
                solution.addTwoNumbers(
                        ListNode.fromString("2->4"),
                        ListNode.fromString("5->6->4")).toString())
    }
}
