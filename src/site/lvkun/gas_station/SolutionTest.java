package site.lvkun.gas_station;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testCanCompleteCircuit() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.canCompleteCircuit(
                array(1,2,3,4,5), array(3,4,5,1,2)
        ));
        Assert.assertEquals(-1, solution.canCompleteCircuit(
                array(2,3,4), array(3,4,3)
        ));
    }
}
