package site.lvkun.leetcode.rectangle_area;

class Solution {
    private int area(int left, int bottom, int right, int top) {
        if (right < left || top < bottom) {
            return 0;
        }

        return (right - left) * (top - bottom);
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int bottom = Math.max(B, F);
        int right = Math.min(C, G);
        int top = Math.min(D, H);

        return area(A, B, C, D)  - area(left, bottom, right, top) + area(E, F, G, H);
    }
}