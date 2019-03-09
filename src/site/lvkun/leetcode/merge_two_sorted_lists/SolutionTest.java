package site.lvkun.leetcode.merge_two_sorted_lists;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ListNode;

public class SolutionTest {
    @Test
    public void testMergeTwoLists() {
        ListNode list1 = ListNode.fromString("1->2->4");
        ListNode list2 = ListNode.fromString("1->3->4");
        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(list1, list2);
        Assert.assertEquals("1->1->2->3->4->4", result.toString());
    }
}
