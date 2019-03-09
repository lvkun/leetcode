package site.lvkun.leetcode.insert_interval;

import site.lvkun.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        for (Interval interval : intervals) {
            if (newInterval == null) {
                result.add(interval);
                continue;
            }

            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(newInterval);
                newInterval = null;
                result.add(interval);
            } else {
                newInterval = new Interval(Math.min(interval.start, newInterval.start),
                        Math.max(interval.end, newInterval.end));
            }
        }

        if (newInterval != null) {
            result.add(newInterval);
        }

        return result;
    }
}