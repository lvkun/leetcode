package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_iii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();
        Assert.assertEquals(6,
                solution.maxProfit(array(3,3,5,0,0,3,1,4)));
        Assert.assertEquals(4,
                solution.maxProfit(array(1,2,3,4,5)));
        Assert.assertEquals(0,
                solution.maxProfit(array(7,6,4,3,1)));
    }
}
