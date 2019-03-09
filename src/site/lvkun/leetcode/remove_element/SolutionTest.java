package site.lvkun.leetcode.remove_element;

import org.junit.Assert;
import org.junit.Test;
import site.lvkun.leetcode.common.ArrayUtils;

import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void testRemoveElement() {
        Solution solution = new Solution();

        int[] num1 = new int[]{3,2,2,3};
        int l1 = solution.removeElement(num1, 3);
        Assert.assertEquals(2, l1);
        List<Integer> list1 = ArrayUtils.from(num1).subList(0, 2);
        Assert.assertEquals(2, Collections.frequency(list1, 2));

        int[] num2 = new int[]{0,1,2,2,3,0,4,2};
        int l2 = solution.removeElement(num2, 2);
        Assert.assertEquals(5, l2);
        List<Integer> list2 = ArrayUtils.from(num2).subList(0, 5);
        Assert.assertEquals(2, Collections.frequency(list2, 0));
        Assert.assertEquals(1, Collections.frequency(list2, 1));
        Assert.assertEquals(1, Collections.frequency(list2, 3));
        Assert.assertEquals(1, Collections.frequency(list2, 4));
    }
}
