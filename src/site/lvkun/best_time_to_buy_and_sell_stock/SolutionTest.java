package site.lvkun.best_time_to_buy_and_sell_stock;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();
        Assert.assertEquals(5,
                solution.maxProfit(array(7,1,5,3,6,4)));
        Assert.assertEquals(0,
                solution.maxProfit(array(7,6,4,3,1)));
    }
}
