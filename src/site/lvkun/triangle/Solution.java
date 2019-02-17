package site.lvkun.triangle;

import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int[] row = new int[lastRow.size()];
        for (int i = 0; i < lastRow.size(); i++) {
            row[i] = lastRow.get(i);
        }

        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> curRow = triangle.get(i);
            for (int j = 0; j < curRow.size(); j++) {
                row[j] = Math.min(row[j], row[j + 1]) + curRow.get(j);
            }
        }

        return row[0];
    }
}
