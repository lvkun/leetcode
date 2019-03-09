package site.lvkun.leetcode.merge_intervals;

import site.lvkun.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    private class IntervalCompator implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(new IntervalCompator());

        List<Interval> result = new ArrayList<>();
        Interval temp = null;
        for (Interval interval :intervals) {
            if (temp == null) {
                temp = interval;
                continue;
            }

            if (interval.start <= temp.end) {
                temp = new Interval(temp.start, Math.max(interval.end, temp.end));
            } else {
                result.add(temp);
                temp = interval;
            }
        }

        result.add(temp);

        return result;
    }
}