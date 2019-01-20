package site.lvkun.common;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    public int start;
    public int end;
    public Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Interval)) {
            return false;
        }

        Interval other = (Interval) obj;

        return other.start == this.start && other.end == this.end;
    }

    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }

    public static List<Interval> createList(String str) {
        String[] list = str
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .split(",");
        List<Interval> result = new ArrayList<>();

        for (int i = 0; i < list.length; i = i + 2) {
            int start = Integer.parseInt(list[i]);
            int end = Integer.parseInt(list[i + 1]);
            result.add(new Interval(start, end));
        }

        return result;
    }
}