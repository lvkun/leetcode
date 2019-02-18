package site.lvkun.valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (!isAlphaNumeric(s.charAt(i))) {
                i++;
            }

            while (!isAlphaNumeric(s.charAt(j))) {
                j--;
            }

            if (!compareIgnoreCase(s.charAt(i), s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return Character.isDigit(c) || Character.isAlphabetic(c);
    }

    private boolean compareIgnoreCase(char c1, char c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2);
    }
}