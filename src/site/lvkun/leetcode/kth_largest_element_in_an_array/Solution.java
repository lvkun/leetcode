package site.lvkun.leetcode.kth_largest_element_in_an_array;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n : nums) {
            if (queue.size() < k) {
                queue.offer(n);
            } else {
                if (n > queue.peek()) {
                    queue.offer(n);
                    queue.poll();
                }
            }
        }

        return queue.peek();
    }
}