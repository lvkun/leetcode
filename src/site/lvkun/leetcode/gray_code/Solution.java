package site.lvkun.leetcode.gray_code;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();

        result.add(0);
        int r = 1;
        for(int i = 0; i < n; i++) {
            int l = result.size();
            for (int j = l - 1; j >= 0; j--) {
                result.add(r + result.get(j));
            }
            r <<= 1;
        }


        return result;
    }
}
