package site.lvkun.leetcode.contains_duplicate_iii;

import java.util.Map;
import java.util.TreeMap;

// TODO: retry
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - j > k) {
                map.remove(nums[j]);
                j++;
            }

            Map.Entry<Integer, Integer> a = map.ceilingEntry(nums[i] - t);
            if (a != null && Math.abs(a.getKey() - nums[i]) <= t) {
                return true;
            }

            map.put(nums[i], i);
        }
        return false;
    }
}