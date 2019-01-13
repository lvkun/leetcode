package site.lvkun.remove_duplicates_from_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] num1 = {1,1,2};
        int l1 = solution.removeDuplicates(num1);
        Assert.assertEquals(l1, 2);
        Assert.assertEquals(num1[0], 1);
        Assert.assertEquals(num1[1], 2);

        int[] num2 = {0,0,1,1,1,2,2,3,3,4};
        int l2 = solution.removeDuplicates(num2);
        Assert.assertEquals(l2, 5);
        Assert.assertEquals(num2[0], 0);
        Assert.assertEquals(num2[1], 1);
        Assert.assertEquals(num2[2], 2);
        Assert.assertEquals(num2[3], 3);
        Assert.assertEquals(num2[4], 4);
    }
}
