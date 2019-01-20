package site.lvkun.merge_intervals;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.common.Interval;

import java.util.List;

public class SolutionTest {
    @Test
    public void testMerge() {
        Solution solution = new Solution();
        List<Interval> result = solution.merge(
                Interval.createList("[[1,3],[2,6],[8,10],[15,18]]"));
        List<Interval> expected = Interval.createList("[[1,6],[8,10],[15,18]]");

        Assert.assertEquals(expected, result);

        result = solution.merge(Interval.createList("[[1,4],[4,5]]"));
        expected = Interval.createList("[[1,5]]");

        Assert.assertEquals(expected, result);
    }
}
