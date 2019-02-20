package site.lvkun.palindrome_partitioning;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testPartition() {
        Solution solution = new Solution();

        List<List<String>> result = solution.partition("aab");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a","a","b"),
                Arrays.asList("aa", "b")
        );
        Assert.assertEquals(expected, result);
    }
}
