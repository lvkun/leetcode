package site.lvkun.leetcode.remove_duplicates_from_sorted_list_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testDeleteDuplicates() {
        Solution solution = new Solution();
        ListNode node = ListNode.fromString("1->2->3->3->4->4->5");
        ListNode result = solution.deleteDuplicates(node);
        Assert.assertEquals("1->2->5", result.toString());

        node = ListNode.fromString("1->1->1->2->3");
        result = solution.deleteDuplicates(node);
        Assert.assertEquals("2->3", result.toString());
    }
}
