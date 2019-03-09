package site.lvkun.leetcode.word_ladder_ii;

import java.util.*;

// TODO: retry
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();

        Map<String, Boolean> wordMap = new HashMap<>();
        for (String word : wordList) {
            wordMap.put(word, false);
        }

        Queue<Deque<String>> pathQueue = new ArrayDeque<>();
        Deque<String> path = new ArrayDeque<>();
        path.add(beginWord);
        pathQueue.add(path);

        Queue<Deque<String>> nextLevel = new ArrayDeque<>();

        while (!pathQueue.isEmpty()) {
            while (!pathQueue.isEmpty()) {
                Deque<String> p = pathQueue.poll();

                String word = p.peekLast();
                wordMap.put(word, true);
                if (word.compareTo(endWord) == 0) {
                    result.add(new ArrayList<>(p));
                    continue;
                }

                for (int i = 0; i < word.length(); i++) {
                    char[] arr = word.toCharArray();
                    char origin_char = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;

                        String newWord = new String(arr);
                        boolean hasVisited = wordMap.getOrDefault(newWord, true);
                        if (!hasVisited) {
                            Deque<String> newPath = new ArrayDeque<>(p);
                            newPath.offerLast(newWord);

                            nextLevel.add(newPath);
                        }
                    }

                    arr[i] = origin_char;
                }
            }

            if (result.size() > 0) {
                return result;
            }

            Queue<Deque<String>> temp = pathQueue;
            pathQueue = nextLevel;
            nextLevel = temp;
        }

        return result;
    }
}
