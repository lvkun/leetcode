package site.lvkun.leetcode.word_ladder_ii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testFindLadders() {
        Solution solution = new Solution();

        List<List<String>> result;
        List<List<String>> expected;
        result = solution.findLadders("hit", "cog",
                Arrays.asList("hot","dot","dog","lot","log","cog"));
        expected = Arrays.asList(
                Arrays.asList("hit","hot","dot","dog","cog"),
                Arrays.asList("hit","hot","lot","log","cog")
        );
        Assert.assertEquals(expected, result);
    }
}
