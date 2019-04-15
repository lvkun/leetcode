package site.lvkun.leetcode.implement_queue_using_stacks;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void testMyStack() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
        Assert.assertEquals(2, stack.pop());
        Assert.assertFalse(stack.empty());
    }
}
