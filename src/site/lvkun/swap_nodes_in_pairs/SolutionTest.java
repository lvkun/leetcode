package site.lvkun.swap_nodes_in_pairs;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {
    @Test
    public void testSwapPairs() {
        ListNode list = ListNode.fromString("1->2->3->4");
        Solution solution = new Solution();
        ListNode result = solution.swapPairs(list);
        Assert.assertEquals("2->1->4->3", result.toString());
    }
}
