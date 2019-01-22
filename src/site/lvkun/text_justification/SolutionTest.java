package site.lvkun.text_justification;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static site.lvkun.common.ArrayUtils.array;

public class SolutionTest {
    private List<String> toList(String s) {
        return Arrays.asList(s.split("\n"));
    }

    @Test
    public void testFullJustify() {
        Solution solution = new Solution();
        List<String> expected = toList(
                "This    is    an\n" +
                "example  of text\n" +
                "justification.  ");
        Assert.assertEquals(expected,
                solution.fullJustify(
                        array("This", "is", "an", "example", "of", "text", "justification."),
                        16));

        expected = toList("What   must   be\n" +
                "acknowledgment  \n" +
                "shall be        ");
        Assert.assertEquals(expected,
                solution.fullJustify(
                        array("What","must","be","acknowledgment","shall","be"),
                        16));

        expected = toList("Science  is  what we\n" +
                "understand      well\n" +
                "enough to explain to\n" +
                "a  computer.  Art is\n" +
                "everything  else  we\n" +
                "do                  ");
        Assert.assertEquals(expected,
                solution.fullJustify(
                        array("Science","is","what","we","understand","well","enough","to","explain",
                                "to","a","computer.","Art","is","everything","else","we","do"),
                        20));
    }
}
