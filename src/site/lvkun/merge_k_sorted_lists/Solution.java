package site.lvkun.merge_k_sorted_lists;

import site.lvkun.common.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    private class NodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new NodeComparator());
        queue.addAll(Arrays.asList(lists));

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            cur.next = node;
            if (node.next != null) {
                queue.offer(node.next);
            }
            cur = node;
        }

        return dummyHead.next;
    }
}
