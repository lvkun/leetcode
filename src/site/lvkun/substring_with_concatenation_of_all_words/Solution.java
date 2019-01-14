package site.lvkun.substring_with_concatenation_of_all_words;

import java.util.*;

class Solution {
    static class Counter<T> {
        private Map<T, Integer> map = new HashMap<>();

        private int size = 0;

        public void add(T t) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }

            size++;
        }

        public int count(T t) {
            if (map.containsKey(t)) {
                return map.get(t);
            }
            return 0;
        }

        public boolean contains(T t) {
            return map.containsKey(t);
        }

        public void clear() {
            map.clear();
            size = 0;
        }

        public int size() {
            return size;
        }
    }

    public List<Integer> findSubstring(String s, String[] words) {
        if (words == null || words.length == 0) {
            return Collections.emptyList();
        }

        int wordLength = words[0].length();

        Counter<String> wordCounter = new Counter<>();
        for (String word : words) {
            wordCounter.add(word);
        }

        int i = 0;
        List<Integer> result = new ArrayList<>();
        Counter<String> foundWords = new Counter<>();
        while (i < s.length()) {
            String curWord = s.substring(i, i + wordLength);

            if (wordCounter.contains(curWord)) {
                if (foundWords.count(curWord) == wordCounter.count(curWord)) {
                    foundWords.clear();
                    foundWords.add(curWord);
                } else {
                    foundWords.add(curWord);

                    if (foundWords.size() == wordCounter.size()) {
                        result.add(i - (foundWords.size() - 1) * wordLength);
                    }
                }
            } else {
                foundWords.clear();
            }

            i += wordLength;
        }

        return result;
    }
}