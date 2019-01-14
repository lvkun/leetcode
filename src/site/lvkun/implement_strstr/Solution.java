package site.lvkun.implement_strstr;

class Solution {
    private int[] nextOf(String needle) {
        int[] next = new int[needle.length()];
        next[0] = 0;

        int k = 0;
        for (int i = 1; i < needle.length(); i++) {
            while (k > 0 && needle.charAt(k) != needle.charAt(i)) {
                k = next[k-1];
            }
            if (needle.charAt(k) == needle.charAt(i)) {
                k++;
            }
            next[i] = k;
        }

        return next;
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}