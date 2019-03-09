package site.lvkun.leetcode.merge_k_sorted_lists;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testMergeKLists() {
        ListNode[] lists = new ListNode[] {
                ListNode.fromString("1->4->5"),
                ListNode.fromString("1->3->4"),
                ListNode.fromString("2->6")
        };
        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(lists);
        Assert.assertEquals("1->1->2->3->4->4->5->6", result.toString());
    }
}
