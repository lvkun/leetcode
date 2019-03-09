package site.lvkun.leetcode.compare_version_numbers;

import java.util.Iterator;

class Solution {
    public int compareVersion(String version1, String version2) {
        Iterator<Integer> i1 = new VersionIterator(version1);
        Iterator<Integer> i2 = new VersionIterator(version2);

        while (i1.hasNext() || i2.hasNext()) {
            int v1 = i1.next();
            int v2 = i2.next();

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }

        return 0;
    }

    private static class VersionIterator implements Iterator<Integer> {
        private int index;
        private int prev = -1;
        private String versionString;

        public VersionIterator(String versionString) {
            this.versionString = versionString + ".";
            this.index = versionString.indexOf('.', prev);
        }

        @Override
        public boolean hasNext() {
            return index != -1;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                return 0;
            }

            String vStr = versionString.substring(prev + 1, index);

            prev = index;
            index = versionString.indexOf('.', index + 1);

            return Integer.parseInt(vStr);
        }
    }
}