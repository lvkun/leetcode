package site.lvkun.leetcode.trapping_rain_water;

import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            if (stack.empty() || height[i] < height[stack.peek()]) {
                stack.push(i);
                continue;
            }

            int start = i;
            int minHeight = Math.min(height[i], height[stack.get(0)]);
            while (!stack.empty() && height[i] > height[stack.peek()]) {
                int curIndex = stack.pop();
                area += (start - curIndex) * (minHeight - height[curIndex]);
                start = curIndex;
            }

            stack.push(i);
        }

        return area;
    }
}