package site.lvkun.leetcode.longest_palindromic_substring;

/*
Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
 */

public class Solution {
    public static class Range {
        private int mStart;
        private int mEnd;
        private String mData;

        public Range(String s, int start, int end) {
            mData = s;
            mStart = start;
            mEnd = end;
        }

        public static Range create(String s, int start, int end) {
            Range r = new Range(s, start, end);
            r.extend();
            return r;
        }

        // extend to find largest palindrome
        private void extend() {
            while (mStart > 0 && mEnd < mData.length() - 1 && mData.charAt(mStart - 1) == mData.charAt(mEnd + 1)) {
                mStart -= 1;
                mEnd += 1;
            }
        }

        @Override
        public String toString() {
            return mData.substring(mStart, mEnd + 1);
        }

        public int length() {
            return mEnd - mStart + 1;
        }
    }

    public String longestPalindrome(String s) {
        Range maxRange = Range.create(s, 0, 0);
        for (int i = 1; i < s.length() - 1; i++) {
            // find palindrome around i
            Range r1 = Range.create(s, i, i);

            if (maxRange.length() < r1.length()) {
                maxRange = r1;
            }

            if (s.charAt(i) == s.charAt(i + 1)) {
                Range r2 = Range.create(s, i, i + 1);

                if (maxRange.length() < r2.length()) {
                    maxRange = r2;
                }
            }

        }
        return maxRange.toString();
    }
}
