package site.lvkun.word_ladder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testLadderLength() {
        Solution solution = new Solution();
        int result = solution.ladderLength("hit", "cog",
                Arrays.asList("hot","dot","dog","lot","log","cog"));
        Assert.assertEquals(5, result);

        result = solution.ladderLength("hit", "cog",
                Arrays.asList("hot","dot","dog","lot","log"));

        Assert.assertEquals(0, result);
    }
}
