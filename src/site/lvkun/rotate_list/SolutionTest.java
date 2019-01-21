package site.lvkun.rotate_list;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.ListNode;

public class SolutionTest {

    @Test
    public void testRotateRight() {
        Solution solution = new Solution();
        ListNode listNode = ListNode.fromString("1->2->3->4->5");
        listNode = solution.rotateRight(listNode, 2);
        Assert.assertEquals("4->5->1->2->3", listNode.toString());

        listNode = ListNode.fromString("0->1->2");
        listNode = solution.rotateRight(listNode, 4);
        Assert.assertEquals("2->0->1", listNode.toString());
    }
}
