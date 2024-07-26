import java.util.*;

static Map<Integer, List<Integer>> graph = new HashMap<>();
static Map<Integer, Boolean> visited = new HashMap<>();

public static void bfs (int startVertex) {
    Queue<Integer> queue = new LinkedList<>();
    // 정수 큐 queue를 초기화,

    queue.offer(startVertex);
    // startVertex를 초기화 한 queue 에 넣는다(offer).
    visited.put(startVertex, true);
    //초기화 한 Map인 visited에 startVertex, true를 넣는다(put).

    while (!queue.isEmpty()) {
        // 초기화 한 queue가 비어있지 않다면,

        int curVertex = queue.poll();
        // curVertex에 queue의 첫번째 요소를 할당, queue에선 제거됨.

        // stack과 queue의 차이
        // stack은 LIFO, queue는 FIFO.
        // 즉, stack에서 pop을 한다면 마지막에 들어간 값(맨 뒤)이 반환되지만,
        // queue에서 poll을 한다면 맨 처음 값(맨 앞)이 반환된다.
        for (int nextVertex : graph.get(curVertex)) {
            // 향상된 for문을 이용해 정수 nexVertex 선언, 각 curVertex에 연결
            if (!visited.containsKey(nextVertex)) {
                // nextVertex의 visited가 false라면 = 방문하지 않았다면,
                queue.offer(nextVertex);
                // queue에 nextVertex를 넣는다(offer).
                visited.put(nextVertex, true);
                // visited에 nextVertex를 방문한 것으로 표시한다.
            }
        }
    }
}
public static void makeGraph() {
    graph.put(0, Arrays.asList(1, 3, 6));
    graph.put(1, Arrays.asList(0, 3));
    graph.put(2, Arrays.asList(3));
    graph.put(3, Arrays.asList(0, 1, 2, 7));
    graph.put(4, Arrays.asList(5));
    graph.put(5, Arrays.asList(4, 6, 7));
    graph.put(6, Arrays.asList(0, 5));
    graph.put(7, Arrays.asList(3, 5));
}
public static void main(String[] args) {
    makeGraph();
    bfs(0);
}
