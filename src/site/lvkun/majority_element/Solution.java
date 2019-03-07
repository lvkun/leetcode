package site.lvkun.majority_element;

class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int one_count = 0;
            int zero_count = 0;

            int mask = 1 << i;

            for (int n : nums) {
                if ((n & mask) == 0) {
                    zero_count++;
                } else {
                    one_count++;
                }

                if (zero_count > nums.length / 2) {
                    result &= ~mask;
                    break;
                } else if (one_count >nums.length / 2) {
                    result |= mask;
                    break;
                }
            }
        }

        return result;
    }
}