package site.lvkun.majority_element;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testMajorityElement() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.majorityElement(array(3,2,3)));
        Assert.assertEquals(2, solution.majorityElement(array(2,2,1,1,1,2,2)));
    }
}
