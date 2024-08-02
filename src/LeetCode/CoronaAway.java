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
                    // r열, c번째가 P(응시자)일 경우,
                    if (!bfs(r, c, place)) {
                        // bfs(r,c,place)가 false일 경우,
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

        // 5*5 boolean값을 가지는 2차원 배열.
        boolean[][] visited = new boolean[5][5];

        Queue<int[]> queue = new ArrayDeque<>();
        // queue에 [startRow,startCol, 0] 형식의 배열이 저장됨.
        queue.offer(new int[]{startRow, startCol, 0});
        // 시작지점인 startRow,startCol의 visisited가 true가 된다.
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            // 위의 queue에서 [startRow,startCol, 0]를 poll해온다.
            int[] cur = queue.poll();
            int r = cur[0]; // r에는 0번째, startRow가 들어감.
            int c = cur[1]; // c에는 1번째, startCol이 들어감.
            int dist = cur[2]; // dist에는 2번째, 0이 들어감.

            // 거리가 0보다 크며(탐색 시작 위치가 아님을 의미),
            // 그 위치에 다른 사람이 있다면(P) 거리두기 실패.
            if (dist > 0 && place[r].charAt(c) == 'P') {
                return false;
            }

            // 거리가 2를 넘어가면 규칙에 상관 없음
            // 거리두기 잘한거니까 continue
            if (dist >= 2) {
                continue;
            }

            // 방향탐색 for문 => 4방향 체크
            for (int i = 0; i < 4; i++) {
                // r,c는 현재 위치의 행,열 인덱스
                // nr, nc는 현재 위치에서 이동했을때의 새로운 행,열 인덱스
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5
                        && !visited[nr][nc]
                        && place[nr].charAt(nc) != 'X') {
                    // 먼저, 이동한 위치가 범위(5*5) 내부에 있는지,
                    //이동한 위치에 visitied가 안찍혀있는지,
                    // 이동한 위치가 'X'(벽)이 아닌지 세가지 체크.
                    queue.offer(new int[]{nr, nc, dist + 1});
                    // 위 조건을 모두 만족한다면, 새로운 위치와 거리를
                    // 큐에 배열로 추가한다.
                    visited[nr][nc] = true;
                    // 방문여부도 true로 바꿔준다.
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