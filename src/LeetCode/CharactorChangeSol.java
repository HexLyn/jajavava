package LeetCode;


import java.util.*;

class CharactorChangeSol {
    public int solution(String begin, String target, String[] words) {
        Queue<wordState> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.offer(new wordState(begin, 0) );

        while (!queue.isEmpty()) {
            // 방문, queue에 있던걸 빼준다(poll)
            wordState cur = queue.poll();

            // 방문한 곳이 찾던 target이라면 return cnt
            if (cur.word.equals(target)) return cur.cnt;

            // nextVertex예약, 여기선 알 수 없는 변수.
            for (int i = 0; i < words.length; i++) {
                if(getDiffCount(cur.word, words[i]) == 1) {
                    if (!visited[i]) {
                    queue.offer(new wordState(words[i], cur.cnt+1));
                    visited[i] = true;
                    }
                }
            }
        }
        return 0;
    }

    int getDiffCount(String a, String b) {
        int diffcount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diffcount++;
        }
        return diffcount;
    }

    //클래스 선언
    class wordState {
        String word;
        int cnt;
        //생성자
        wordState(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}