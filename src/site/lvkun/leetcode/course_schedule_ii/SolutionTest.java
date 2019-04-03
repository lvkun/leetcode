package site.lvkun.leetcode.course_schedule_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testFindOrder() {
        Solution solution = new Solution();
        int[][] courses = new int[][] {{1,0}};
        int[] result = solution.findOrder(2, courses);
        Assert.assertArrayEquals(array(0,1), result);

        courses = new int[][] {{1,0},{2,0},{3,1},{3,2}};
        result = solution.findOrder(4, courses);
        Assert.assertArrayEquals(array(0,1,2,3), result);
    }
}
