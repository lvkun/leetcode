package site.lvkun.leetcode.reverse_linked_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testReverse() {
        Solution solution = new Solution();
        ListNode result = solution.reverseList(ListNode.fromString("1->2->3->4->5"));
        Assert.assertEquals("5->4->3->2->1", result.toString());
    }
}
