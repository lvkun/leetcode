package site.lvkun.leetcode.reorder_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testReorderList() {
        Solution solution = new Solution();
        ListNode head = ListNode.fromString("1->2->3->4");
        solution.reorderList(head);
        Assert.assertEquals("1->4->2->3", head.toString());

        head = ListNode.fromString("1->2->3->4->5");
        solution.reorderList(head);
        Assert.assertEquals("1->5->2->4->3", head.toString());
    }
}
