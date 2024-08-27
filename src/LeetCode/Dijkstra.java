package LeetCode;

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Map<Integer, List<Edge>> graph = new HashMap<>() {{
            // 각 번호가 몇번과 연결돼있고, 사이 거리는 어느정도인지.
            // 노드1은 2와 2거리로 연결, 4와 1거리로 연결되어 있다.
            // 노드2는 3과 2거리, 5와 2거리, 6과 4거리로 연결되어있다.
            put(1, List.of(new Edge(2, 2), new Edge(4, 1)));
            put(2, List.of(new Edge(3, 2), new Edge(5, 2), new Edge(6, 4)));
            put(3, List.of(new Edge(6, 4)));
            put(4, List.of(new Edge(7, 5)));
            put(5, List.of(new Edge(8, 1)));
            put(6, List.of(new Edge(5, 3)));
            put(7, List.of(new Edge(6, 7), new Edge(8, 6)));
            put(8, List.of());
        }};

        // 다익스트라를 활용하여 1시작 8도착의 최단거리를 구한다.
        int distance = dijkstra(graph, 1, 8);
        System.out.println("distance = " + distance);
    }

    private static int dijkstra(Map<Integer, List<Edge>> graph, int start, int end) {
        // graph(그래프의 인접 리스트), start(시작 노드), end(목표 노드) 입력받음.
        final int INF = Integer.MAX_VALUE;
        // INF에 최대값, 무한과 같은 값을 넣는다.
        // 모든 노드에 대해 거리를 무한대로 초기화 한다.
        // 시작 노드의 거리를 0으로 설정한다.

        // 정수배열 distance는 입력받은 graph의 size + 1 을 넣는다.
        int[] distance = new int[graph.size() + 1];
        Arrays.fill(distance, INF);

        Queue<Entry> pq = new PriorityQueue<>();
        pq.add(new Entry(start, 0));
        // 우선순위 큐에 (시작노드번호, 0(거리))를 넣는다.
        // distance[시작번호] = 0
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Entry current = pq.remove();
            // 우선순위 큐이므로 가장 작은 거리(distance)를 가진 노드가 제거/반환된다.
            if (distance[current.node] < current.distance) continue;
            // 연결된 노드의 새로운 거리가 현재 거리보다 작으면,
            // 그 노드의 거리를 갱신 하고 큐를 추가한다.

            // 현재 노드에 연결된 모든 인접 노드에 대해 거리 갱신 시도
            for (Edge edge : graph.get(current.node)) {
                int newDist = current.distance + edge.distance; // 새로운 거리 계산
                if (newDist < distance[edge.to]) { // 더 짧은 경로가 발견될 때,
                    distance[edge.to] = newDist; // 거리 갱신,
                    pq.add(new Entry(edge.to, newDist)); // 해당 노드를 큐에 추가.
                }
            }
        }

        return distance[end];
        // 결과값으로 distance의 최단거리를 반환하게 된다.
    }

    static class Edge {
        // 두 노드를 연결하는 간선을 나타낸다.

        private int to;
        // to : 간선이 연결되는 노드

        private int distance;
        // distance : 간선의 가중치

        public Edge(int to, int distance) {
            this.to = to;
            this.distance = distance;
        }
    }

    static class Entry implements Comparable<Entry> {
        // Entry 클래스는 우선순위 큐에서 사용할 노드와 거리를 나타낸다.

        private int node;
        // node : 현재 노드의 번호

        private int distance;
        // distance : 출발점에서 해당 노드까지의 누적 거리.
        // 이 클래스는 Comparable 인터페이스로 구현하여
        // 우선순위 큐에서 거리(distance)를 기준으로 항목들을 정렬할 수 있다.

        public Entry(int node, int distance) {
            this.node = node; // 생성자로 노드 번호와 거리를 초기화.
            this.distance = distance;
        }

        @Override
        public int compareTo(Entry o) {
            return this.distance - o.distance;
            // 거리에 따라 비교하여 우선순위 큐에서 정렬.
        }
    }
}