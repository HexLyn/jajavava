package LeetCode;

import java.util.*;

class CoronaAway {
    public int[] solution(String[][] places) {
        int n = places.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (check(places[i])) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    // 모든 사람이 거리두기를 잘 하고 있는지 체크하는 함수
    // 모두 다 잘 지키고 있으면 true,
    // 한명이라도 안지키고 있으면 false.
    boolean check(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (place[r].charAt(c) == 'P') {
                    if (!bfs(r, c, place)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 거리 2 이하에 사람이 없으면 true,
    // 있으면 false 반환
    boolean bfs(int startRow, int startCol, String[] place) {
        int[] dr = {0, 1, -1, 0};
        int[] dc = {-1, 0, 0, 1};

        boolean[][] visited = new boolean[5][5];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startRow, startCol, 0});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];

            if (dist > 0 && place[r].charAt(c) == 'P') {
                return false;
            }

            if (dist >= 2) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5
                        && !visited[nr][nc] && place[nr].charAt(nc) != 'X') {
                    queue.offer(new int[]{nr, nc, dist + 1});
                    visited[nr][nc] = true;
                }
            }
        }
        return true;
    }
}



// 대기실은 5개, 각 대기실은 5*5 크기
// 거리두기를 위해 응시자들 끼리 거리는 맨해튼 거리 2이하로 앉으면 안됨.
// 두 테이블 T1, T2가 행렬 (r1, c1), (r2, c2)에 각각 위치하고 있다면,
// T1, T2 사이의 맨해튼 거리는 |r1 - r2| + |c1 - c2| 이다.
// 단, 응시자가 앉은 자리 사이가 파티션으로 막혀있으면 허용.

// 각 대기실별로, 거리두기를 지키고 있으면 1,
// 한명이라도 지키지 않고 있으면 0을 배열에 담아 반환.
// return값의 형식
// : 1차원 정수배열에 5개의 원소를 담아 반환.
// places에 담겨있는 5개 대기실 순서대로, 거리두기 준수여부를 배열에 담음.

// places =[["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"],
//          ["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"],
//          ["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"],
//          ["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"],
//          ["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]]
// return = [1, 0, 1, 1, 1]

//places의 원소는 P,O,X로 이루어진 문자열입니다.
//places 원소의 길이(대기실 가로 길이) = 5
//P는 응시자가 앉아있는 자리를 의미합니다.
//O는 빈 테이블을 의미합니다.
//X는 파티션을 의미합니다.

// for문을 이용해 places[i]별 확인절차 수행.
// 수행하며 1 또는 0 저장

// P를 기준점으로 bfs를 하며 범위 내 사람이 있는지 확인.
// 파티션이면 돌아가는 형식
// X가 아니면 통과 가능한 길로 생각.