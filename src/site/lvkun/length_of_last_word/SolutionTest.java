package site.lvkun.length_of_last_word;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLastWord() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }
}
