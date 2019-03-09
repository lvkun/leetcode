package site.lvkun.leetcode.subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        resultList.add(result);

        for (int i = 0; i < nums.length; i++) {
            int length = resultList.size();
            for (int j = 0; j < length; j++) {
                List<Integer> newResult = new ArrayList<>(resultList.get(j));
                newResult.add(nums[i]);
                resultList.add(newResult);
            }
        }

        return resultList;
    }
}