package site.lvkun.leetcode.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<Character, String> letterMap = new HashMap<>();

    public Solution() {
        letterMap.put('1', "");
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
        letterMap.put('0', " ");
    }

    public List<String> letterCombinations(String digits) {
        List<String> lettersList = new ArrayList<>();
        int totalLength = 1;
        for (int i = 0; i < digits.length(); i++) {
            String letters = letterMap.get(digits.charAt(i));
            if (letters.length() > 0) {
                totalLength *= letters.length();
                lettersList.add(letters);
            }
        }

        List<String> result = new ArrayList<>();
        char[] temp = new char[lettersList.size()];
        for (int i = 0; i < totalLength; i++) {
            int r = i;
            for (int j = temp.length - 1; j >= 0; j--) {
                String letters = lettersList.get(j);
                int charIndex = r % letters.length();
                temp[j] = letters.charAt(charIndex);
                r = r / letters.length();
            }
            result.add(new String(temp));
        }

        return result;
    }
}
