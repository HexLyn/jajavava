package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

class ShortestGame {
    public int solution(int[][] maps) {
        // rows, cols는 맵의 길이.
        int rows = maps.length;
        int cols = maps[0].length;
        // 방문했던 곳을 저장할 2차원 배열.
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new ArrayDeque<>();

        //queue에 시작지점을 넣어주고, 방문 체크.
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        //진행 가능 방향 = 상하좌우.
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { -1, 0, 1, 0 };

        while(!queue.isEmpty()) {
            // 만들어둔 큐에서 값을 빼와 curPos로, 현재위치 의미.
            int[] curPos = queue.remove();
            int curRow = curPos[0]; // curPos[0]은 행위치
            int curCol = curPos[1]; // curPos[1]는 열위치
            int curLength = curPos[2]; // curPos[2]는 현재까지 이동거리.

            if(curRow == rows - 1 && curCol == cols -1) {
                // 현재위치가 게임의 목적지(끝)라면, 현재 이동거리 반환.
                return curLength;
            }
            // 끝나지 않았으면 시행.
            for (int d = 0; d < 4; d++) {
                // dr,dc은 위에서 만들어둔 진행 방향.
                int nr = curRow + dr[d], nc = curCol + dc[d];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && maps[nr][nc] == 1) {
                    // maps[nr][nc] == 1은 길을 의미. 0이 통과불가의 벽.
                    if (!visited[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.add(new int[]{ nr, nc, curLength + 1 });
                    }
                }
            }
        }
        return -1;
    }
}

// 두 팀으로 나눠서 상대팀 진영에 최대한 빨리 도착.

// ex) 5*5크기의 맵이 주어짐,
// 내 캐릭터는 (1,1)에 위치,
// 상대 팀 진영은 (5,5)에 위치.
// 검은 상자(0)는 벽으로 이동 불가, 흰 부분(1)이 길.
// 캐릭터의 이동은 상하좌우로 가능. 맵을 벗어날 수 없다.
// 최대한 빨리 도착하는 경우를 찾기.
// 상대 진영에 도달 못하는 경우도 있을 수 있다.
// 그 경우 -1 리턴.

// bfs로 최단 경로 찾기
