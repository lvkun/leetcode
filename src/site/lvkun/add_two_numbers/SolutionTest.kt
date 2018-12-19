package site.lvkun.add_two_numbers

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    private fun listNode(input : String): ListNode? {
        return input.split("->")
                .map { c -> ListNode(c.trim().toInt()) }
                .foldRight(null) { cur, prev:ListNode? ->
                    cur.next = prev
                    cur
                }
    }

    @Test
    fun testListNode() {
        val node = listNode("2 -> 4 -> 3")
        Assert.assertEquals("2 -> 4 -> 3", node.toString())
    }

    @Test
    fun testAddTwoNumbers() {
        val solution = Solution()
        Assert.assertEquals("7 -> 0 -> 8",
                solution.addTwoNumbers(
                        listNode("2 -> 4 -> 3"),
                        listNode("5 -> 6 -> 4")).toString())
        Assert.assertEquals("7",
                solution.addTwoNumbers(
                        listNode("2"),
                        listNode("5")).toString())
        Assert.assertEquals("0 -> 1",
                solution.addTwoNumbers(
                        listNode("5"),
                        listNode("5")).toString())
        Assert.assertEquals("7 -> 0 -> 5",
                solution.addTwoNumbers(
                        listNode("2 -> 4"),
                        listNode("5 -> 6 -> 4")).toString())
    }
}
