package site.lvkun.largest_number;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> numList = new ArrayList<>();
        for (int i : nums) {
            numList.add(String.valueOf(i));
        }
        numList.sort(new Comparator<String>() {
            private int compareInternal(String s1, String s2) {
                char[] v1 = s1.toCharArray();
                int len1 = v1.length;
                char[] v2 = s2.toCharArray();
                int len2 = v2.length;

                int lim = Math.min(len1, len2);
                int k = 0;
                while (k < lim) {
                    char c1 = v1[k];
                    char c2 = v2[k];

                    if (c1 != c2) {
                        return c1 - c2;
                    }
                    k++;
                }

                if (len1 > len2) {
                    return v1[k] - v1[0];
                }

                return v2[0] - v2[k];
            }

            @Override
            public int compare(String s1, String s2) {
                return compareInternal(s2, s1);
            }
        });
        return String.join("", numList);
    }
}
