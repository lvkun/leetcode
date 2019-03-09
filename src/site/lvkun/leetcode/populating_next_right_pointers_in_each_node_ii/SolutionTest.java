package site.lvkun.leetcode.populating_next_right_pointers_in_each_node_ii;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.Node;

public class SolutionTest {
    @Test
    public void testConnect() {
        Solution solution = new Solution();
        Node root =
                new Node(1,
                        new Node(2,
                                new Node(4, null, null, null),
                                new Node(5, null, null, null), null),
                        new Node(3,
                                null,
                                new Node(7, null, null, null), null),
                        null);

        Node result = solution.connect(root);

        Assert.assertEquals(result.right, result.left.next);
        Assert.assertEquals(result.left.right, result.left.left.next);
        Assert.assertEquals(result.right.right, result.left.right.next);
    }
}
