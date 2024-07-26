package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

class ShortestGame {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { -1, 0, 1, 0 };

        while(!queue.isEmpty()) {
            int[] curPos = queue.remove();
            int curRow = curPos[0];
            int curCol = curPos[1];
            int curLength = curPos[2];

            if(curRow == rows - 1 && curCol == cols -1) {
                return curLength;
            }

            for (int d = 0; d < 4; d++) {
                int nr = curRow + dr[d], nc = curCol + dc[d];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && maps[nr][nc] == 1) {
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
// 상대 팀 진영은 (5,5)에 위.
// 검은 상자(0)는 벽으로 이동 불가, 흰 부분(1)이 길.
// 캐릭터의 이동은 상하좌우로 가능. 맵을 벗어날 수 없다.
// 최대한 빨리 도착하는 경우를 찾기.
// 상대 진영에 도달 못하는 경우도 있을 수 있다.
// 그 경우 -1 리턴.

// bfs로 최단 경로 찾기
