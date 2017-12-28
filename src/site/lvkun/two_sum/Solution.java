package site.lvkun.two_sum;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n=0, other=0;

        for(int i = 0; i < numbers.length; i++) {

            n = i;
            int key = target - numbers[n];

            if (map.containsKey(key)) {
                other = map.get(key);
                if (n != other)
                    break;
            }

            map.put(numbers[i], i);
        }

        return new int[]{other, n};
    }
}
