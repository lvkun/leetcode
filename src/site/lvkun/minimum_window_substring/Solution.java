package site.lvkun.minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

// TODO: retry
class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, 0);
        }

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        int count = t.length();
        int minStart = 0, minLen = s.length() + 1;

        while (end < s.length()) {
            char ch = s.charAt(end);
            if (map.get(ch) > 0) {
                count--;
            }

            map.put(ch, map.get(ch) - 1);
            while (count == 0){
                if (end - start + 1 < minLen){
                    minLen = end - start + 1;
                    minStart = start;
                }
                char cha = s.charAt(start);
                map.put(cha, map.get(cha) + 1);
                if (map.get(cha) > 0){
                    count++;
                }
                start++;
            }
            end++;
        }

        if (minLen == s.length() + 1){
            return "";
        } else {
            return s.substring(minStart, minStart + minLen);
        }
    }
}
