package site.lvkun.leetcode.substring_with_concatenation_of_all_words;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testFindSubstring() {
        Solution solution = new Solution();
        List<Integer> result1 = solution.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
        Assert.assertEquals(Arrays.asList(0, 9), result1);

        List<Integer> result2 = solution.findSubstring("wordgoodgoodgoodbestword",
                new String[] {"word","good","best","word"});
        Assert.assertEquals(0, result2.size());
    }
}
