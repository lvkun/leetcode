package site.lvkun.longest_substring_without_repeating_characters;

public class Solution {
    private static final int INVALID_POSITION = -1;

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[] indexMap = new int[256];
        for (int i = 0; i < indexMap.length; i++) {
            indexMap[i] = INVALID_POSITION;
        }

        int maxLength = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int dupPos = indexMap[c];
            indexMap[c] = i;
            end = i;

            if (dupPos != INVALID_POSITION && dupPos >= start) {
                maxLength = Math.max(maxLength, end - start);

                start = dupPos + 1;
            }
        }

        maxLength = Math.max(maxLength, end - start + 1);

        return maxLength;
    }
}
