package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] search = word.toCharArray();

        public static boolean inArea(int r, int c) {
            return(r >= 0 && r < board.length && c >= 0 && c < board[0].length);
        }

        public static void bfs(int r, int c) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{r, c});

            for (int r = 0; r < m; r++) {
                for(int c=0; c <n; c++) {
                    if(flag[r][c] == true) {
                        queue.add(new int[]{r, c});
                    }
                }
            }
        }

        boolean[][] flag;
        int m = board[0].length;
        int n = board.length;
        char[] wordSet = word.toCharArray();

        //시작지점은 flag를 true로, 아니면 false.
        for(int i = 0; i< m; i++) {
            for(int j = 0; j< n; j++) {
                if( board[i][j] == wordSet[0] ) {
                    flag[i][j] = true;
                } else flag[i][j] = false;
            }
        }


    }
}
// 구성.
// 범위 내부에 위치한지 탐색
// 시작지점 찾기
// 탐색




// m x n 배열 char속성의 board와 문자열 word가 주어진다.
// 배열에 word가 존재한다면 true를 반환한다.

//Input: board = [
// ["A","B","C","E"],
// ["S","F","C","S"],
// ["A","D","E","E"]
// ],
// word = "ABCCED"
// Output: true

// 완전탐색, 하지만 범위는 주어진 word가 존재하는지 찾는 것이므로
// 범위는 word의 길이만큼만 해보면 된다.
// word 문자열을 찾는거니 시작은 word 첫글자 찾아서 시작.
// 그 다음 방향 탐색도 상하좌우 중 다음 글자에 해당하는 부분으로 전진.
// 완성되는 루트 있으면 true


