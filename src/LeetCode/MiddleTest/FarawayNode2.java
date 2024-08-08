package LeetCode.MiddleTest;

import java.util.*;

public class FarawayNode2 {
    public int solution(int n, int[][] edge) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<=n; i++) {
            map.put(i, new ArrayList<>());
        }

        for(int[] e : edge) {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        return bfs(map,1, n);
    }

    int bfs(Map<Integer, List<Integer>> map, int startVertex, int n) {
            boolean[] visited = new boolean[n+1];
            Queue<int[]> queue = new ArrayDeque<>();
            queue.offer(new int[]{startVertex, 0});
            visited[startVertex] = true;
            int maxDist = -1;
            int count =0;

            while(!queue.isEmpty()) {
                int[] cur = queue.poll();
                int curVertex = cur[0];
                int dist = cur[1];

                if(dist > maxDist) {
                    maxDist = dist;
                    count=0;
                }
                count++;

                for(int nextVertex : map.get(curVertex)) {
                    if(!visited[nextVertex]) {
                        queue.offer(new int[]{nextVertex, dist+1});
                        visited[nextVertex] = true;
                    }
                }
            }

        return count;
    }
}