package site.lvkun.leetcode.reverse_integer;

class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = 10 * result + x % 10;
            x = x / 10;
        }
        return result;
    }
}
