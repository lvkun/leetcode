package site.lvkun.leetcode.insertion_sort_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testInsertionSortList() {
        Solution solution = new Solution();
        ListNode node = ListNode.fromString("4->2->1->3");
        ListNode result = solution.insertionSortList(node);
        Assert.assertEquals("1->2->3->4", result.toString());

        node = ListNode.fromString("-1->5->3->4->0");
        result = solution.insertionSortList(node);
        Assert.assertEquals("-1->0->3->4->5", result.toString());
    }
}
