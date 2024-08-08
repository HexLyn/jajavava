package LeetCode;

import java.util.*;

public class Electricity {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        boolean[] visited;
        Map<Integer, List<Integer>> graph = new HashMap<>();




        for(int[]wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a].remove(Integer.valueOf(b));
            graph[b].remove(Integer.valueOf(a));
        }

        int dfs(int cur, int n) {
            int count=1;
            visited[cur]=true;
            for(int next : graph.get(cur)) {
                if (!visited[next]) {
                    count += dfs(next, n);
                }
            }
            answer =Math.min( answer, Math.abs(n -count *2)) ;
            return count;
        }
        }

    }

// n개의 송전탑이 전선을 통해 트리형태로 연결.
// 이 전선들 중 하나를 끊어 현재 네트워크를 2개로 분할한다.
// 이때, 두 전력망이 갖게되는 송전탑의 개수를 최대한 비슷하게.
// 송전탑의 개수 n, 전선 정보 wires가 매개변수로 주어진다.
// 전선 하나를 끊어 송전탑 개수가 비슷하도록 분할할 때,
// 두 전력망이 가지고 있는 송전탑 개수의 차이(절대값) 반환.

//n	   wires	          result
//9	 [[1,3],[2,3],[3,4],  3
//    [4,5],[4,6],[4,7],
//    [7,8],[7,9]]


// 한번씩 모든 연결을 끊고, 두 네트워크의 노드 개수 계산.
// 두 노드 개수의 차(절대값)가 제일 작은 경우의 차를 반환.