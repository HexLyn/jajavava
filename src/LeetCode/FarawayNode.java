package LeetCode;

import java.util.*;

public class FarawayNode {
    public int solution(int n, int[][] edge) {

        //받은 edge를 인접 리스트로 변환.
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= n; i++){
            graph.put(i, new ArrayList<>());
        }

        for(int[]e : edge) {
            //받은 edge에서 서로 연결을 해준다.
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        return bfs(graph,1, n);
    }
    int bfs(Map<Integer, List<Integer>> graph, int startVertex, int n) {
        boolean[] visited = new boolean[n+1];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startVertex, 0});
        visited[startVertex] = true;
        int maxDist = -1;
        int count = 0;

        while(!queue.isEmpty()){
            // 현재 노드 방문
            int[] cur = queue.poll();
            int curVertex = cur[0];
            int dist = cur[1];

            if(dist > maxDist) {
                maxDist = dist;
                count = 0;
            }
            count++;

            // 다음 노드 예약
            for(int nextVertex : graph.get(curVertex)) {
                if(!visited[nextVertex]) {
                    queue.offer(new int[]{nextVertex, dist+1});
                    visited[nextVertex] = true;
                }
            }
        }

        return count;
    }
}


// n개의 노드가 있는 그래프. 각 노드는 1~n까지 번호가 적혀있다.
// 1번 노드에서 가장 멀리 떨어진 노드의 개수를 구한다.
// 가장 멀리 떨어진 노드 : 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드
// 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 주어질 때,
// 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 반환.

//노드의 개수 n은 2 이상 20,000 이하입니다.
//간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
//vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.

// n	 vertex	                    return
// 6	[[3, 6], [4, 3], [3, 2],    3
//      [1, 3], [1, 2], [2, 4],
//      [5, 2]]
// vertex 해석: 3-6 연결됨, 4-3 연결됨, 3-2 연결됨, ... ,5-2 연결됨.
