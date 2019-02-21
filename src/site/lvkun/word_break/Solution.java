package site.lvkun.word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO: retry
class Solution {
    private Set<String> mWordDict = new HashSet<>();
    private int[] cache;

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return false;
        }

        mWordDict = new HashSet<>(wordDict);
        cache = new int[s.length()];
        return wordBreak(s, 0);
    }

    private boolean wordBreak(String s, int start) {
        if (start >= s.length()) {
            return true;
        }

        if (cache[start] != 0) {
            return cache[start] != -1;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String word = s.substring(start, i);
            if (mWordDict.contains(word) && wordBreak(s, i)) {
                cache[start] = 1;
                return true;
            }
        }

        cache[start] = 0;
        return false;
    }
}