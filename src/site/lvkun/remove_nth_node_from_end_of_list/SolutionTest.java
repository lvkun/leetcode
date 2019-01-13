package site.lvkun.remove_nth_node_from_end_of_list;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution.ListNode buildFromString(String str) {
        Solution.ListNode head = null;
        Solution.ListNode cur = null;
        for (String valStr : str.split("->")) {
            int val = Integer.parseInt(valStr);
            if (head == null) {
                head = new Solution.ListNode(val);
                cur = head;
                continue;
            }

            Solution.ListNode node = new Solution.ListNode(val);
            cur.next = node;
            cur = node;
        }

        return head;
    }

    private String nodeToString(Solution.ListNode node) {
        if (node == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            if (node.next != null) {
                builder.append("->");
            }
            node = node.next;
        }

        return builder.toString();
    }

    @Test
    public void testRemoveNthFromEnd() {
        Solution.ListNode node = buildFromString("1->2->3->4->5");
        Solution solution = new Solution();
        Solution.ListNode node2 = solution.removeNthFromEnd(node, 2);
        Assert.assertEquals("1->2->3->5", nodeToString(node2));
    }
}
