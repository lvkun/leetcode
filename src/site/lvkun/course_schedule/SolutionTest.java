package site.lvkun.course_schedule;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.matrixInt;

public class SolutionTest {
    @Test
    public void testCanFinish() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canFinish(2, matrixInt("[[1, 0]]")));
        Assert.assertFalse(solution.canFinish(2, matrixInt("[" +
                "[1, 0],\n" +
                "[0, 1]" +
                "]")));
    }
}
