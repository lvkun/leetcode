package site.lvkun.leetcode.clone_graph;

import site.lvkun.leetcode.common.UndirectedGraphNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);

        map.put(node, newNode);

        for (UndirectedGraphNode n : node.neighbors) {
            UndirectedGraphNode nNeighbor;
            if (map.containsKey(n)) {
                nNeighbor = map.get(n);
            } else {
                nNeighbor = cloneGraph(n);
            }

            newNode.neighbors.add(nNeighbor);
        }

        return newNode;
    }
}
