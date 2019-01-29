package site.lvkun.remove_duplicates_from_sorted_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {
    @Test
    public void testDeleteDuplicates() {
        Solution solution = new Solution();

        ListNode node = ListNode.fromString("1->1->2");
        ListNode result = solution.deleteDuplicates(node);
        Assert.assertEquals("1->2", result.toString());

        node = ListNode.fromString("1->1->2->3->3");
        result = solution.deleteDuplicates(node);
        Assert.assertEquals("1->2->3", result.toString());
    }
}
