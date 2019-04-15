package site.lvkun.leetcode.implement_queue_using_stacks;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    private Queue<Integer> first;
    private Queue<Integer> second;

    /** Initialize your data structure here. */
    public MyStack() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        second.offer(x);
        while (!first.isEmpty()) {
            second.offer(first.poll());
        }

        Queue<Integer> temp = second;
        second = first;
        first = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return first.poll();
    }

    /** Get the top element. */
    public int top() {
        return first.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return first.isEmpty();
    }
}
