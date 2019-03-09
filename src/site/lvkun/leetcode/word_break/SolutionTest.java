package site.lvkun.leetcode.word_break;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testWordBreak() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.wordBreak("leetcode", Arrays.asList("leet", "code")));
        Assert.assertTrue(solution.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        Assert.assertFalse(solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}
