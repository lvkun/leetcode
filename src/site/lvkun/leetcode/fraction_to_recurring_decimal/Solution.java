package site.lvkun.leetcode.fraction_to_recurring_decimal;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        int sn = numerator >= 0 ? 1 : -1;
        int sd = denominator >= 0 ? 1 : -1;
        int sign = sn * sd;

        if (denominator == 0) {
            return "";
        }

        if (numerator == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if (sign == -1) {
            result.append("-");
        }

        long num = Math.abs(numerator);
        long den = Math.abs(denominator);

        if (num > den) {
            result.append(num / den);
            num = num % den;
        }

        if (num == 0) {
            return result.toString();
        }

        if (result.length() == 0) {
            result.append("0");
        }

        result.append(".");

        StringBuilder fraction = new StringBuilder();
        Set<Long> numSet = new HashSet<>();
        while (!numSet.contains(num * 10)) {
            while (num < den) {
                num *= 10;
            }

            numSet.add(num);
            fraction.append(num / den);
            num = num % den;

            if (num == 0) {
                return result.append(fraction.toString()).toString();
            }
        }

        return result.append("(").append(fraction.toString()).append(")").toString();
    }
}