package site.lvkun.TwoSum;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n=0, other=0;

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);

            n = i;
            int key = target - numbers[n];

            if (map.containsKey(key)) {
                other = map.get(key);
                if (n != other)
                    break;
            }
        }

        return new int[]{other+1, n+1};
    }
}
