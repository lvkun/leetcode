package site.lvkun.jump_game;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testCanJump() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canJump(array(2,3,1,1,4)));
        Assert.assertFalse(solution.canJump(array(3,2,1,0,4)));
    }
}
