package site.lvkun.interleaving_string;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();

        if (l1 + l2 != l3) {
            return false;
        }

        Queue<Pos> queue = new ArrayDeque<>();
        queue.offer(Pos.create(0, 0, 0));
        Pos curPos = queue.peek();
        while (queue.size() > 0) {
            curPos = queue.poll();
            curPos.appendPossiblePos(s1, s2, s3, queue);
        }

        if (curPos.i1 == l1
                && curPos.i2 == l2
                && curPos.i3 == l3) {
            return true;
        }

        return false;
    }

    private static class Pos {
        int i1;
        int i2;
        int i3;

        public Pos(int i1, int i2, int i3) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
        }

        public static Pos create(int i1, int i2, int i3) {
            return new Pos(i1, i2, i3);
        }

        public void appendPossiblePos(String s1,
                                      String s2,
                                      String s3,
                                      Queue<Pos> queue) {
            if (i1 < s1.length() && i3 < s3.length()
                && s1.charAt(i1) == s3.charAt(i3)) {
                queue.add(create(i1 + 1, i2, i3 + 1));
            }
            if (i2 < s2.length() && i3 < s3.length()
                    && s2.charAt(i2) == s3.charAt(i3)) {
                queue.add(create(i1, i2 + 1, i3 + 1));
            }
        }
    }
}
