package site.lvkun.remove_nth_node_from_end_of_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {
    @Test
    public void testRemoveNthFromEnd() {
        ListNode node = ListNode.fromString("1->2->3->4->5");
        Solution solution = new Solution();
        ListNode node2 = solution.removeNthFromEnd(node, 2);
        Assert.assertEquals("1->2->3->5", node2.toString());
    }
}
