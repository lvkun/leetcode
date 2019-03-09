package site.lvkun.leetcode.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    private Map<Character, Character> parentheses = new HashMap<>();

    public Solution() {
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (parentheses.containsKey(c)) {
                if (stack.pop() != parentheses.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}