package site.lvkun.intersection_of_two_linked_lists;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {
    @Test
    public void testGetIntersectionNode() {
        Solution solution = new Solution();
        ListNode headA = ListNode.fromString("4->1->8->4->5");
        ListNode headB = ListNode.fromString("5->0->1");
        headB.find(1).next = headA.find(8);

        ListNode result = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(8, result.val);

        headA = ListNode.fromString("0->9->1->2->4");
        headB = ListNode.fromString("3");
        headB.next = headA.find(2);

        result = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(2, result.val);

        headA = ListNode.fromString("2->6->4");
        headB = ListNode.fromString("1->5");
        result = solution.getIntersectionNode(headA, headB);
        Assert.assertNull(result);
    }
}
