package LeetCode;

// 컴퓨터 A와 B가 직접 연결되고, B와 C가 연결되어 있을 때,
// A와 C도 간접적으로 연결되어 정보 교환이 가능하다.
// 이 경우 A,B,C는 같은 네트워크 상에 있다고 한다.

// 컴퓨터의 대수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때,
// 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

// i번 컴퓨터와 j번 컴퓨터가 연결되었을 시 computers[i][j] = 1로 표현.
// computers[i][i] 의 경우 언제나 1이다.

//computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]], n=3이면 1은 자기자신,2와 연결, 2는 1과 자기자신, 3은 자기자신만 연결
//이 배열이 주어졌을 때, 네트워크 개수를 반환해야 함.
// computers[0(i-1)] 호출, 1이 2개 이상이면 연결된 다른 컴퓨터가 있는걸로 친다.
// 1이 있으면 새로 배열을 만들고 true를 넣는다.


class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(n, i, visited, computers);
                answer++;
            }
        }
        return answer;
    }

    void dfs(int n, int cur, boolean[] visited, int[][] computers) {
        visited[cur] = true;

        for (int i = 0; i < n; i++) {
            if(computers[cur][i] == 1 && !visited[i]) {
                dfs(n, i, visited, computers);
            }
        }
    }
}