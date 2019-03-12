package site.lvkun.leetcode.count_primes;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCountPrimes() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.countPrimes(10));
    }
}
