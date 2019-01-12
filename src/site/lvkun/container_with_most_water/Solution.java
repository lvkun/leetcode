package site.lvkun.container_with_most_water;

/*
Given n non-negative integers a1, a2, ..., an ,
where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container,
such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 */

class Solution {
    private int area(int[] height, int start, int end) {
        int w = end - start;
        int h = Math.min(height[start], height[end]);
        return w * h;
    }

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (end > start) {
            max = Math.max(max, area(height, start, end));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}