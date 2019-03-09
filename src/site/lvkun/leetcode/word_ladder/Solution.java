package site.lvkun.leetcode.word_ladder;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Boolean> wordMap = new HashMap<String, Boolean>();
        for (String word : wordList) {
            wordMap.put(word, false);
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);

        Queue<String> next = new ArrayDeque<>();

        int count = 0;
        while (queue.size() > 0) {
            for (String word : queue) {
                if (word.compareTo(endWord) == 0) {
                    return count + 1;
                }

                for (int i = 0; i < word.length(); i++) {
                    char[] arr = word.toCharArray();
                    char origin_char = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;

                        String newWord = new String(arr);
                        boolean hasVisited = wordMap.getOrDefault(newWord, true);
                        if (!hasVisited) {
                            next.add(newWord);
                            wordMap.put(newWord, true);
                        }
                    }

                    arr[i] = origin_char;
                }
            }

            queue.clear();
            Queue<String> temp = queue;
            queue = next;
            next = temp;

            count++;
        }

        return 0;
    }
}