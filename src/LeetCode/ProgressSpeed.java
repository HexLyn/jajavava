package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ProgressSpeed {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            // 기능 별 반환까지 걸리는 일수.
            queue.add((100 - progresses[i]+speeds[i]-1) / speeds[i]);
        }
        // [93, 30, 55], [1,30,5] 면 현재 큐는 [7,4,9].
        // 맨 앞 반환 + 뒤에있는게 i번째보다 작으면 같이 반환.

        //반환 큐
        while(!queue.isEmpty()) {
            //peek 확인만, remove 반환하며 제거.
            int define = queue.remove();
            int count = 1;

            while(!queue.isEmpty() && queue.peek() <= define) {
                queue.remove();
                count++;
            }
            list.add(count);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}



