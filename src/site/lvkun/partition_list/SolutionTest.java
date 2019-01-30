package site.lvkun.partition_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {

    @Test
    public void testPartition() {
        Solution solution = new Solution();

        ListNode node = ListNode.fromString("1->4->3->2->5->2");
        ListNode result = solution.partition(node, 3);

        Assert.assertEquals("1->2->2->4->3->5", result.toString());
    }
}
