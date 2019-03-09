package site.lvkun.leetcode.reverse_nodes_in_k_group;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testReverseKGroup() {
        Solution solution = new Solution();
        ListNode result2 =
                solution.reverseKGroup(ListNode.fromString("1->2->3->4->5"), 2);
        Assert.assertEquals("2->1->4->3->5", result2.toString());
        ListNode result3 =
                solution.reverseKGroup(ListNode.fromString("1->2->3->4->5"), 3);
        Assert.assertEquals("3->2->1->4->5", result3.toString());
    }
}
