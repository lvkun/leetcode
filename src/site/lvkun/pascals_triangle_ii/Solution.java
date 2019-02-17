package site.lvkun.pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] result = new int[rowIndex + 1];

        result[0] = 1;
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 1; --j) {
                result[j] += result[j - 1];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : result) {
            list.add(i);
        }
        return list;
    }
}
