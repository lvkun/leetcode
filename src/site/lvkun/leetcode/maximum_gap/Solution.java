package site.lvkun.leetcode.maximum_gap;

class Solution {
    public int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : nums) {
            max = Math.max(n, max);
            min = Math.min(n, min);
        }

        int bucketSize = (max - min) / nums.length + 1;
        int bucketNumber = (max - min) / bucketSize + 1;


        int[] maxBucket = new int[bucketNumber];
        int[] minBucket = new int[bucketNumber];
        for (int i = 0; i < bucketNumber; i++) {
            maxBucket[i] = Integer.MIN_VALUE;
            minBucket[i] = Integer.MAX_VALUE;
        }

        for (int n : nums) {
            int idx = (n - min) / bucketSize;

            maxBucket[idx] = Math.max(n, maxBucket[idx]);
            minBucket[idx] = Math.min(n, minBucket[idx]);
        }

        int result = 0;
        int curMax = maxBucket[0];
        for (int i = 1; i < bucketNumber; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) {
                result = Math.max(result, minBucket[i] - curMax);
                curMax = maxBucket[i];
            }
        }

        return result;
    }
}