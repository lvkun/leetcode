package site.lvkun.add_two_numbers;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {

    @Test
    public void testListNode() {
        ListNode node = ListNode.fromString("2->4->3");
        Assert.assertEquals(node.toString(), "2->4->3");
    }

    @Test
    public void testAddTwoNumbers() {
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(ListNode.fromString("2->4->3"),
                ListNode.fromString("5->6->4"));
        Assert.assertEquals(result.toString(), "7->0->8");

        result = solution.addTwoNumbers(ListNode.fromString("2"),
                ListNode.fromString("5"));
        Assert.assertEquals(result.toString(), "7");

        result = solution.addTwoNumbers(ListNode.fromString("5"),
                ListNode.fromString("5"));
        Assert.assertEquals(result.toString(), "0->1");

        result = solution.addTwoNumbers(ListNode.fromString("2->4"),
                ListNode.fromString("5->6->4"));
        Assert.assertEquals(result.toString(), "7->0->5");
    }
}
