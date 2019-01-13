package site.lvkun.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, n, "", result);
        return result;
    }

    private void generateParenthesis(int left, int right, String result, List<String> resultList) {
        if (left > 0) {
            generateParenthesis(left - 1, right, result + "(", resultList);
        }

        if (right > 0 && right > left) {
            generateParenthesis(left, right - 1, result + ")", resultList);
        }

        if (left == 0 && right == 0) {
            resultList.add(result);
        }
    }
}