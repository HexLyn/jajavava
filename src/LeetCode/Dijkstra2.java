package LeetCode;

import java.util.*;

public class Dijkstra2 {

    public static void main(String[] args) {
        Map<Integer, List<Edge>> graph = new HashMap<>() {{
            put(1, List.of(new Edge(2, 2), new Edge(4, 1)));
            put(2, List.of(new Edge(3, 2), new Edge(5, 2), new Edge(6, 4)));
            put(3, List.of(new Edge(6, 4)));
            put(4, List.of(new Edge(7, 5)));
            put(5, List.of(new Edge(8, 1)));
            put(6, List.of(new Edge(5, 3)));
            put(7, List.of(new Edge(6, 7), new Edge(8, 6)));
            put(8, List.of());
        }};

        int distance = dijkstra(graph, 1, 8);
        System.out.println(distance);
    }

    private static int dijkstra(Map<Integer, List<Edge>> graph, int start, int end) {
        final int INF = Integer.MAX_VALUE;
        int[] distance = new int[graph.size() + 1];
        Arrays.fill(distance, INF);

        Queue<Entry> pq = new PriorityQueue<>();
        pq.add(new Entry(start, 0));
        distance[start] = 0;

        while(!pq.isEmpty()) {
            Entry current = pq.remove();
            if(distance[current.node] < current.distance) continue;
            for(Edge edge : graph.get(current.node)) {
                int newDist = current.distance + edge.distance;
                if(newDist < distance[edge.to]) {
                    distance[edge.to] = newDist;
                    pq.add(new Entry(edge.to, newDist));
                }
            }
        }
        return distance[end];
    }

    static class Edge {
        private int to;
        private int distance;

        public Edge(int to, int distance) {
            this.to = to;
            this.distance = distance;
        }
    }

    static class Entry implements Comparable<Entry> {
        private int node;
        private int distance;

        public Entry(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Entry o) {
            return this.distance - o.distance;
        }
    }

}