package site.lvkun.leetcode.reverse_linked_list_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testReverseBetween() {
        Solution solution = new Solution();

        ListNode head = ListNode.fromString("1->2->3->4->5");
        ListNode result = solution.reverseBetween(head, 2, 4);
        Assert.assertEquals("1->4->3->2->5", result.toString());
    }
}
