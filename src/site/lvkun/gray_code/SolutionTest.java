package site.lvkun.gray_code;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testGrayCode() {
        Solution solution = new Solution();
        List<Integer> result = solution.grayCode(2);
        Assert.assertEquals(Arrays.asList(0,1,3,2), result);

        result = solution.grayCode(0);
        Assert.assertEquals(Arrays.asList(0), result);
    }
}
