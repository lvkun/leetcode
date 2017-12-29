package site.lvkun.add_two_numbers;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode from(String numberString) {
        if (numberString == null) {
            return null;
        }

        String[] valList = numberString.split(" -> ");
        if (valList.length == 0) {
            return null;
        }

        ListNode head = null;
        ListNode cur = null;

        for (String valStr : valList) {
            int val = Integer.valueOf(valStr);
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
        if (next != null) {
            return String.valueOf(val) + " -> " + next;
        }

        return String.valueOf(val);
    }
}
