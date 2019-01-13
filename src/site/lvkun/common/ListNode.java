package site.lvkun.common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode fromString(String str) {
        ListNode head = null;
        ListNode cur = null;
        for (String valStr : str.split("->")) {
            int val = Integer.parseInt(valStr.trim());
            if (head == null) {
                head = new ListNode(val);
                cur = head;
                continue;
            }

            ListNode node = new ListNode(val);
            cur.next = node;
            cur = node;
        }

        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode node = this;
        while (node != null) {
            builder.append(node.val);
            if (node.next != null) {
                builder.append("->");
            }
            node = node.next;
        }
        return builder.toString();
    }
}

