package LeetCode.finalTest;

import java.util.*;
import java.util.stream.Collectors;

public class NetworkDelayTime {
    public int solution(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> edges = Arrays.stream(times)
                .collect(Collectors.groupingBy(t->t[0]));
        int[] visited = new int[n+1];
        Arrays.fill(visited, Integer.MAX_VALUE);
        Queue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[1] - e2[1]);
        pq.add(new int[]{k, 0});
        visited[k] = 0;

        int maxTime = 0;
        int visitCount = 1;
        while(!pq.isEmpty()) {
            int[] cur = pq.remove();
            int u = cur[0], time = cur[1];
            if(visited[u] < time) continue;
            maxTime = time;

            if(!edges.containsKey(u)) continue;
            for(int[] edge : edges.get(u)) {
                int v= edge[1], w= edge[2];
                if(time + w >= visited[v]) continue;

                if(visited[v] == Integer.MAX_VALUE) visitCount++;
                visited[v] = time + w;
                pq.add(new int[]{v,time+w});
            }
        }
        return visitCount == n? maxTime : -1;
    }
}

// n개의 노드가 있으며, 각 노드의 이름은 1부터 n까지의 정수.
// times는 각 배선을 이동하는데 걸리는 시간을 저장.
// times[i] = (ui, vi, wi) 로 주어진다.
// ui는 근원 노드, vi는 목표 노드, wi는 이동하는데 걸리는 시간.
// 시작 노드 k, 시작 노드에서 모든 노드를 방문하는데 걸리는 최소 시간 반환.
// 모든 노드 도달 불가능 하다면 -1 반환.
