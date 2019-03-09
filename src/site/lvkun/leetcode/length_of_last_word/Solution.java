package site.lvkun.leetcode.length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        int lastSpaceIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                lastSpaceIndex = i;
            }
        }

        return s.length() - lastSpaceIndex - 1;
    }
}
