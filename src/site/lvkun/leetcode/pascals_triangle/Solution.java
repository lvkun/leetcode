package site.lvkun.leetcode.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        result.add(1);

        resultList.add(new ArrayList<>(result));
        for (int i = 1; i < numRows; i++) {
            List<Integer> lastResult = resultList.get(i - 1);

            result.clear();
            result.add(1);

            for (int j = 1; j < i; j++) {
                result.add(lastResult.get(j) + lastResult.get(j - 1));
            }

            result.add(1);

            resultList.add(new ArrayList<>(result));
        }

        return resultList;
    }
}