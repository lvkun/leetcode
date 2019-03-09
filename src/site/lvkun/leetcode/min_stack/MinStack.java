package site.lvkun.leetcode.min_stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> numberStack;
    Stack<Integer> minStack;

    public MinStack() {
        numberStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        numberStack.push(x);
        if (minStack.isEmpty() || x < minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int n = numberStack.pop();
        if (n == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return numberStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}