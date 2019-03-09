package site.lvkun.leetcode.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;
    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UndirectedGraphNode)) {
            return false;
        }

        UndirectedGraphNode node = (UndirectedGraphNode) obj;
        return equals(this, node, new HashSet<>());
    }

    private boolean equals(UndirectedGraphNode n1, UndirectedGraphNode n2,
                           Set<UndirectedGraphNode> visited) {
        if (visited.contains(n2)) {
            return true;
        }

        if (n1.label != n2.label) {
            return false;
        }

        visited.add(n2);

        if (n1.neighbors.size() != n2.neighbors.size()) {
            return false;
        }

        for (int i = 0; i < n2.neighbors.size(); i++) {
            if (!equals(n1.neighbors.get(i), n2.neighbors.get(i), visited)) {
                return false;
            }
        }

        return true;
    }
}
