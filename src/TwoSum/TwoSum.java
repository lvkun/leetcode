package TwoSum;

import java.util.HashMap;


public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap map = new HashMap();

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        int n=0, other=0;
        for(int i = 0; i < numbers.length; i++) {
            n = i;
            int key = target - numbers[n];

            if (map.containsKey(key)) {
                other = (Integer)map.get(key);
                if (n != other)
                    break;
            }
        }

        return new int[]{n+1, other+1};
    }
}
