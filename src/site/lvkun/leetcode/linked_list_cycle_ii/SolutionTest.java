package site.lvkun.leetcode.linked_list_cycle_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testDetectCycle() {
        Solution solution = new Solution();
        ListNode head = ListNode.fromString("3->2->0->4");
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next;
        ListNode result = solution.detectCycle(head);
        Assert.assertEquals(2, result.val);
    }
}
