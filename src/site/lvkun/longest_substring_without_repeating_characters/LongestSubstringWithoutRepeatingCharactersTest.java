package site.lvkun.longest_substring_without_repeating_characters;

import junit.framework.TestCase;

public class LongestSubstringWithoutRepeatingCharactersTest extends TestCase {

    private int checkString(String s) {
        return Solution.lengthOfLongestSubstring(s);
    }

    public void testLengthOfLongestSubstring() throws Exception {
        assertEquals(0, checkString(""));
        assertEquals(1, checkString("A"));
        assertEquals(1, checkString("AA"));
        assertEquals(4, checkString("Abcdbcd"));
        assertEquals(6, checkString("Abcdbcdefg"));
        assertEquals(3, checkString("abcabcbb"));
    }
}