package site.lvkun.leetcode.jump_game_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testJump() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.jump(array(2,3,1,1,4)));
    }
}
