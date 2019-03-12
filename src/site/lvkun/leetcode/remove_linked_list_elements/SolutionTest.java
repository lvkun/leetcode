package site.lvkun.leetcode.remove_linked_list_elements;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testRemoveElements() {
        Solution solution = new Solution();
        ListNode result = solution.removeElements(ListNode.fromString("1->2->6->3->4->5->6"), 6);
        Assert.assertEquals("1->2->3->4->5", result.toString());
    }
}
