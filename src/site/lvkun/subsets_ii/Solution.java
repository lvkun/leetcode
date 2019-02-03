package site.lvkun.subsets_ii;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        resultList.add(new ArrayList<>(result));

        if (nums == null || nums.length == 0) {
            return resultList;
        }

        result.add(nums[0]);
        resultList.add(new ArrayList<>(result));
        int size = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                size = resultList.size();
            }
            int newSize = resultList.size();
            for (int j = newSize - size; j < newSize; j++) {
                result = new ArrayList<>(resultList.get(j));
                result.add(nums[i]);
                resultList.add(result);
            }
        }

        return resultList;
    }
}
