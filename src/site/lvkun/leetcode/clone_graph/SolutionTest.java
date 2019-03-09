package site.lvkun.leetcode.clone_graph;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.UndirectedGraphNode;

public class SolutionTest {
    @Test
    public void testCloneGraph() {
        Solution solution = new Solution();

        UndirectedGraphNode node0 = new UndirectedGraphNode(0);
        UndirectedGraphNode node1 = new UndirectedGraphNode(1);
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);

        node0.neighbors.add(node1);
        node0.neighbors.add(node2);

        node1.neighbors.add(node2);

        node2.neighbors.add(node2);

        UndirectedGraphNode result = solution.cloneGraph(node0);

        Assert.assertEquals(node0, result);
    }
}
