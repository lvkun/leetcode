package site.lvkun.leetcode.wildcard_matching;

class Solution {
    private boolean isMatch(String s, String p, int is, int ip) {
        if (is == s.length()) {
            return ip == p.length() || p.charAt(ip) == '*';
        }

        if (ip == p.length()) {
            return false;
        }

        char cp = p.charAt(ip);

        if (cp == '*') {
            int start = is;
            while (start <= s.length()) {
                if (ip  == p.length() - 1 || isMatch(s, p, start, ip + 1)) {
                    return true;
                }

                start++;
            }
        } else if (cp == '?' || cp == s.charAt(is)) {
            return isMatch(s, p, is + 1, ip + 1);
        }

        return false;
    }

    public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }
}