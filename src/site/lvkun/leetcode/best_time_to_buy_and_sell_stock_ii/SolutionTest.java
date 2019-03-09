package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_ii;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.leetcode.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();
        Assert.assertEquals(7,
                solution.maxProfit(array(7,1,5,3,6,4)));
        Assert.assertEquals(4,
                solution.maxProfit(array(1,2,3,4,5)));
    }
}
