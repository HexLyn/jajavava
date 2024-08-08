package LeetCode.MiddleTest;

import java.util.ArrayDeque;
import java.util.Queue;

class ShortestGame2 {
    public int solution(int[][] maps) {
        int Clen = maps[0].length;
        int Rlen = maps.length;

        boolean[][] visited = new boolean[Rlen][Clen];
        Queue<int[]> q = new ArrayDeque<>();

        q.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] curPos = q.remove();
            int curR = curPos[0];
            int curC = curPos[1];
            int dist = curPos[2];

            if(curR == Rlen -1 && curC == Clen -1) {
                return dist;
            }

            for(int i = 0; i < 4; i++) {
                int newR = curR + dr[i];
                int newC = curC + dc[i];
                if(newR >= 0 && newR < Rlen && newC >= 0 && newC < Clen && maps[newR][newC] == 1 ) {
                    if(!visited[newR][newC]) {
                        visited[newR][newC] = true;
                        q.add(new int[]{newR, newC, dist+1});
                    }
                }
            }
        }
        
        return -1;
    }
}

