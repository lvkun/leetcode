package site.lvkun.longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int longest = 0;
        for (int i : nums) {
            if (!set.contains(i)) {
                continue;
            }

            int l = i;
            int r = i;

            while (set.contains(l - 1)) {
                l--;
                set.remove(l);
            }

            while (set.contains(r + 1)) {
                r++;
                set.remove(r);
            }

            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }
}