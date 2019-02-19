package site.lvkun.course_schedule;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// TODO: retry
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null) {
            return true;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] in = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int[] edge = prerequisites[i];
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

        while (!queue.isEmpty()) {
            int from = queue.poll();

            List<Integer> adjList = graph.get(from);
            for (int to : adjList) {
                in[to]--;
                if (in[to] == 0) {
                    queue.offer(to);
                }
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (in[i] != 0) {
                return false;
            }
        }

        return true;
    }
}