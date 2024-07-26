package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathMatrix {
    boolean isInRange(int r, int c, int rowLength, int colLength) {
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength);
    }
    // 주어진 grid 내에 위치해 있는지 확인.

    public int shortestPathMatrix(int[][] grid) {
        int shortestDist = -1;
        //기본적으로 도달 못했을 시의 반환값 -1를 할당.
        int rowLength = grid.length;
        int colLength = grid[0].length;

        if( grid[0][0] != 0 || grid[rowLength-1][colLength-1] != 0 ) {
            return shortestDist;
        }
        // 시작 위치가 0이 아니거나(OR), 도착 지점이 0이 아니라면,
        // 도달할 수 없기 때문에 바로 -1 리턴하면서 종료.

        int[][] dir = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
        // 상하좌우, 대각선 4방향 정의.

        boolean[][] visited = new boolean[rowLength][colLength];

        //시작점 큐에 넣기
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;

        //bfs
        while(!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curRow = curPos[0];
            int curCol = curPos[1];
            int curLength = curPos[2];
            // 정수배열 curPos는 queue에서 poll() 해온 값으로 구성.
            // 현재 위치.

            if(curRow == rowLength-1 && curCol == colLength-1) {
                // 목적지(좌측 최하단)에 도착했을 경우,
                shortestDist = curLength;
                // 경로의 길이 할당 - 반환.
                return shortestDist;
            }

            // 위 if문이 실행 안되었을 시 아래의 for문으로 넘어감.
            for (int[] d : dir) {
                int nextRow = curRow + d[0];
                int nextCol = curCol + d[1];

                if (isInRange(nextRow, nextCol, rowLength, colLength)) {
                    if (grid[nextRow][nextCol] == 0 && !(visited[nextRow][nextCol])) {
                        queue.offer(new int[]{nextRow, nextCol, curLength + 1});
                        visited[nextRow][nextCol] = true;
                    }
                }
            }
        }
        return shortestDist;
        }
    }


// 이진수 배열 grid를 받는다.
// 가장 짧은 경로를 반환해야 한다.
// 그런 경로가 없으면 -1 반환.

//방문가능한 경로는 0으로.
//셀의 이동은 8방향으로 가능.
// 경로의 반환은 지나온 경로의 길이를 반환.

//최단경로를 찾기 위해 bfs로 가까운 범위는 모두 찾아보는 형식으로,
// 도달 한 순간 값을 반환.
// 그렇게 최심부까지 진행해도 도달 못하면 -1 반환.