package site.lvkun.leetcode.insert_interval;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.Interval;

import java.util.List;

public class SolutionTest {
    @Test
    public void testInsert() {
        Solution solution = new Solution();
        List<Interval> result = solution.insert(Interval.createList("[[1,3],[6,9]]"),
                new Interval(2,5));
        List<Interval> expected = Interval.createList("[[1,5],[6,9]]");

        Assert.assertEquals(expected, result);

        result = solution.insert(Interval.createList("[[1,2],[3,5],[6,7],[8,10],[12,16]]"),
                new Interval(4, 8));
        expected = Interval.createList("[[1,2],[3,10],[12,16]]");

        Assert.assertEquals(expected, result);
    }
}
