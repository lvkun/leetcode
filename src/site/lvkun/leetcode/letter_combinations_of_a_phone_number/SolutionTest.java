package site.lvkun.leetcode.letter_combinations_of_a_phone_number;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testLetterCombinations() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                solution.letterCombinations("23"));
    }
}
