package site.lvkun.largest_rectangle_in_histogram;

import java.util.Stack;

class Solution {

    private int getHeight(int[] heights, int index) {
        if (index >= 0 && index < heights.length) {
            return heights[index];
        }

        return -1;
    }

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        if (heights.length == 1) {
            return heights[0];
        }

        Stack<Integer> hStack = new Stack<>();
        hStack.push(0);
        int maxArea = heights[0];

        for (int i = 1; i <= heights.length; i++) {
            // calculate area from i
            while (!hStack.isEmpty() &&
                    getHeight(heights, hStack.peek()) > getHeight(heights, i)) {
                int hI = hStack.pop();
                int start = hI;
                if (!hStack.isEmpty()) {
                    start = hStack.peek() + 1;
                }
                int area = getHeight(heights, hI) * (i - start);
                maxArea = Math.max(maxArea, area);
            }
            hStack.push(i);
        }

        return maxArea;
    }
}