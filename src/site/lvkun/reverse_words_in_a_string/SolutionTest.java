package site.lvkun.reverse_words_in_a_string;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testReverseWords() {
        Solution solution = new Solution();
        Assert.assertEquals("blue is sky the", solution.reverseWords("the  sky  is  blue"));
    }
}
