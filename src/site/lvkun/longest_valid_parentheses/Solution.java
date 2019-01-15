package site.lvkun.longest_valid_parentheses;

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        int maxLength = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    length = 0;
                } else {
                    stack.pop();
                    length += 2;
                    if (maxLength < length) {
                        maxLength = length;
                    }
                }
            }
        }

        return maxLength;
    }
}