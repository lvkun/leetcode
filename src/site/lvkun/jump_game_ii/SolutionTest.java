package site.lvkun.jump_game_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testJump() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.jump(array(2,3,1,1,4)));
    }
}
