package site.lvkun.palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private boolean isPalindrome(char[] data, int start, int end) {
        int i = start;
        int j = end - 1;
        while (i < j) {
            if (data[i] != data[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> resultList = new ArrayList<>();

        if (s == null) {
            return resultList;
        }

        Stack<String> result = new Stack<>();
        char[] data = s.toCharArray();

        partition(data, 0, result, resultList);

        return resultList;
    }

    private void partition(char[] data, int start, Stack<String> result, List<List<String>> resultList) {
        if (start == data.length) {
            resultList.add(new ArrayList<>(result));
            return;
        }

        for (int i = start + 1; i <= data.length; i++) {
            if (isPalindrome(data, start, i)) {
                result.push(new String(data, start, i - start));
                partition(data, i, result, resultList);
                result.pop();
            }
        }
    }
}
