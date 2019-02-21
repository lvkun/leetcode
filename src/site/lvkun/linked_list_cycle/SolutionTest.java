package site.lvkun.linked_list_cycle;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {
    @Test
    public void testHasCycle() {
        Solution solution = new Solution();

        ListNode head = ListNode.fromString("3->2->0->4");
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next;

        Assert.assertTrue(solution.hasCycle(head));
    }
}
