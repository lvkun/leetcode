package site.lvkun.leetcode.longest_substring_without_repeating_characters;

public class Solution {
    private static final int INVALID_POSITION = 0;

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[] indexMap = new int[256];
        int maxLength = 1;
        int start = 0;
        int end = 0;
        int dupPos;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            dupPos = indexMap[c];
            end = i;

            if (dupPos != INVALID_POSITION && dupPos >= start) {
                maxLength = Math.max(maxLength, end - start);

                start = dupPos;
            }

            indexMap[c] = i + 1;
        }

        maxLength = Math.max(maxLength, end - start + 1);

        return maxLength;
    }
}
