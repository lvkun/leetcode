package site.lvkun.leetcode.gas_station;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null ||gas.length != cost.length) {
            return -1;
        }

        int total = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];

            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }

        return total < 0 ? -1 : start;
    }
}