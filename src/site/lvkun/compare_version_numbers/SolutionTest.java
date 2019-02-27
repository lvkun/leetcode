package site.lvkun.compare_version_numbers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCompareVersion() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.compareVersion("0.1", "1.1"));
        Assert.assertEquals(1, solution.compareVersion("1.0.1", "1"));
        Assert.assertEquals(-1, solution.compareVersion("7.5.2.4", "7.5.3"));
        Assert.assertEquals(0, solution.compareVersion("1.01", "1.001"));
        Assert.assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
    }
}
