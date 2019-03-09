package site.lvkun.leetcode.group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    private static final int LETTER_NUMBER = 26;
    private int[] letterCounter = new int[LETTER_NUMBER];

    private String keyOf(String s) {
        for (int i = 0; i < letterCounter.length; i++) {
            letterCounter[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letterCounter[c - 'a']++;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < letterCounter.length; i++) {
            builder.append(letterCounter[i]);
        }

        return builder.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (String s : strs) {
            String key = keyOf(s);
            if (!group.containsKey(key)) {
                group.put(key, new ArrayList<>());
            }
            group.get(key).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (List<String> result : group.values()) {
            resultList.add(result);
        }

        return resultList;
    }
}