package site.lvkun.leetcode.implement_strstr;

class Solution {
    private int[] nextOf (String needle) {
        int[] next = new int[needle.length()];

        int n = 0;
        for (int i = 1; i < next.length; i++) {
            while (n > 0 && needle.charAt(n) != needle.charAt(i)) {
                n = next[n - 1];
            }
            if (needle.charAt(n) == needle.charAt(i)) {
                n++;
            }
            next[i] = n;
        }

        return next;
    }

    public int strStr (String haystack, String needle){
        int[] next = nextOf(needle);
        int n = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (n > 0 && haystack.charAt(i) != needle.charAt(n)) {
                n = next[n - 1];
            }
            if (haystack.charAt(i) == needle.charAt(n)) {
                n++;
            }
            if (n == needle.length()) {
                return i - n + 1;
            }
        }

        return -1;
    }
}