package site.lvkun.leetcode.course_schedule_ii;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// TODO: retry
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites == null) {
            return null;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] in = new int[numCourses];
        for (int[] edge : prerequisites) {
            int from = edge[1];
            int to = edge[0];
            graph.get(from).add(to);
            in[to]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> path = new ArrayList<>();

        while (!queue.isEmpty()) {
            int from = queue.poll();
            path.add(from);

            List<Integer> adj = graph.get(from);

            for (int to : adj) {
                in[to]--;

                if (in[to] == 0) {
                    queue.offer(to);
                }
            }
        }

        for (int i = 0; i < in.length; i++) {
            in[i] = path.get(i);
        }

        return in;
    }
}