package site.lvkun.remove_duplicates_from_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] num1 = {1,1,2};
        int l1 = solution.removeDuplicates(num1);
        Assert.assertEquals(2, l1);
        Assert.assertEquals(1, num1[0]);
        Assert.assertEquals(2, num1[1]);

        int[] num2 = {0,0,1,1,1,2,2,3,3,4};
        int l2 = solution.removeDuplicates(num2);
        Assert.assertEquals(5, l2);
        Assert.assertEquals(0, num2[0]);
        Assert.assertEquals(1, num2[1]);
        Assert.assertEquals(2, num2[2]);
        Assert.assertEquals(3, num2[3]);
        Assert.assertEquals(4, num2[4]);
    }
}
