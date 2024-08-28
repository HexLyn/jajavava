package LeetCode.finalTest;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(n,i,visited,computers);
                answer++;
            }
        }
        return answer;
    }

    void dfs(int n, int cur, boolean[] visited, int[][] computers) {
        visited[cur] = true;

        for(int i=0; i< n; i++) {
            if(computers[cur][i] == 1 && !visited[i]) {
                dfs(n,i,visited,computers);
            }
        }
    }
}

// 컴퓨터의 개수 n, 연결에 대한 2차원 배열 computers가 주어진다.
// 네트워크의 개수를 return.
// ex) 컴퓨터 A,B 연결, B,C가 연결되어 있다면 A,C 도 연결된 것.
