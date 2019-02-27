package site.lvkun.find_peak_element;

import org.junit.Assert;
import org.junit.Test;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    @Test
    public void testFindPeakElement() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findPeakElement(array(1,2,3,1)));
        Assert.assertEquals(5, solution.findPeakElement(array(1,2,1,3,5,6,4)));
    }
}
