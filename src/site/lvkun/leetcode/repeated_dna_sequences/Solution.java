package site.lvkun.leetcode.repeated_dna_sequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();

        if (s == null || s.length() < 10) {
            return new ArrayList<>(result);
        }

        char[] array = s.toCharArray();
        int key = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char c = array[i];
            key = ((key << 3) | c & 7);
        }

        for (int i = 9; i < s.length(); i++) {
            char c = array[i];
            key = (((0x7ffffff & key) << 3) | (c & 7));

            if (set.contains(key)) {
                result.add(new String(array, i - 9, 10));
            }
            set.add(key);
        }

        return new ArrayList<>(result);
    }
}
