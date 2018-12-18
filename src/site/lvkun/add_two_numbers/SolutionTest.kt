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
        Assert.assertEquals("7 -> 0 -> 8", solution.addTwoNumbers(listNode("2 -> 4 -> 3"),
                listNode("5 -> 6 -> 4")).toString())
    }
//
//    @Test
//    public void testAddTwoNumbers() {
//        Solution solution = new Solution();
//        ListNode result = solution.addTwoNumbers(ListNode.from("2 -> 4 -> 3"),
//        ListNode.from("5 -> 6 -> 4"));
//        Assert.assertEquals(result.toString(), "7 -> 0 -> 8");
//
//        result = solution.addTwoNumbers(ListNode.from("2"),
//                ListNode.from("5"));
//        Assert.assertEquals(result.toString(), "7");
//
//        result = solution.addTwoNumbers(ListNode.from("5"),
//                ListNode.from("5"));
//        Assert.assertEquals(result.toString(), "0 -> 1");
//
//        result = solution.addTwoNumbers(ListNode.from("2 -> 4"),
//                ListNode.from("5 -> 6 -> 4"));
//        Assert.assertEquals(result.toString(), "7 -> 0 -> 5");
//    }
}
