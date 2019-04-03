package site.lvkun.leetcode.add_and_search_word_data_structure_design;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testWordDictionary() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        Assert.assertFalse(dictionary.search("pad"));
        Assert.assertTrue(dictionary.search("bad"));
        Assert.assertTrue(dictionary.search(".ad"));
        Assert.assertTrue(dictionary.search("b.."));
    }
}
