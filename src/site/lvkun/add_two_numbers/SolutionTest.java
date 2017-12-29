package site.lvkun.add_two_numbers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testListNode() {
        ListNode node = ListNode.from("2 -> 4 -> 3");
        Assert.assertEquals(node.toString(), "2 -> 4 -> 3");
    }

    @Test
    public void testAddTwoNumbers() {
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(ListNode.from("2 -> 4 -> 3"),
                ListNode.from("5 -> 6 -> 4"));
        Assert.assertEquals(result.toString(), "7 -> 0 -> 8");

        result = solution.addTwoNumbers(ListNode.from("2"),
                ListNode.from("5"));
        Assert.assertEquals(result.toString(), "7");

        result = solution.addTwoNumbers(ListNode.from("5"),
                ListNode.from("5"));
        Assert.assertEquals(result.toString(), "0 -> 1");

        result = solution.addTwoNumbers(ListNode.from("2 -> 4"),
                ListNode.from("5 -> 6 -> 4"));
        Assert.assertEquals(result.toString(), "7 -> 0 -> 5");
    }
}
