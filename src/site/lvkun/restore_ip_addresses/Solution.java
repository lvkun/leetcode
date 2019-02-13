package site.lvkun.restore_ip_addresses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private boolean validIpAddress(String s, int start, int end) {
        if (end > s.length()) {
            return false;
        }

        String sub = s.substring(start, end);
        int ip = Integer.parseInt(sub);
        return ip <= 255 && ip >= 0;
    }

    private boolean canMakeIpAddress(String s, int start, Stack<String> result) {
        int remain = 4 - result.size();

        int leftChar = s.length() - start;

        if (leftChar > remain * 3 || leftChar < remain) {
            return false;
        }

        return true;
    }

    public  void restoreIpAddresses(String s, int start, Stack<String> result, List<String> resultList) {
        if (start == s.length()) {
            if (result.size() == 4) {
                resultList.add(String.join(".", result));
            }
            return;
        }

        if (!canMakeIpAddress(s, start, result)) {
            return;
        }

        if (validIpAddress(s, start, start + 1)) {
            result.push(s.substring(start, start + 1));
            restoreIpAddresses(s, start + 1, result, resultList);
            result.pop();
        }

        if (validIpAddress(s, start, start + 2)) {
            result.push(s.substring(start, start + 2));
            restoreIpAddresses(s, start + 2, result, resultList);
            result.pop();
        }

        if (validIpAddress(s, start, start + 3)) {
            result.push(s.substring(start, start + 3));
            restoreIpAddresses(s, start + 3, result, resultList);
            result.pop();
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> resultList = new ArrayList<>();
        Stack<String> result = new Stack<>();

        restoreIpAddresses(s, 0, result, resultList);

        return resultList;
    }
}