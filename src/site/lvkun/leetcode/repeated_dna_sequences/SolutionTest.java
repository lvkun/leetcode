package site.lvkun.leetcode.repeated_dna_sequences;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testFindRepeatedDnaSequences() {
        Solution solution = new Solution();
        Assert.assertEquals(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"),
                solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}
