package LeetCode;

import java.util.Stack;

public class DailyTemper {
    public int[] solution(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int prevDay = stack.pop();
                answer[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return answer;
    }
}

//int형 배열 temperatures를 받는다.
//answer 배열은 더 따뜻해질 날이 얼마나 남았는지.
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: answer      = [1,1,4,2,1,1,0,0]
//temperatures[1] = 73, 73보다 더 따뜻해질 날은 바로 다음날, 1 출력
//temperatures[3] = 75, 75보다 더 따뜻해질 날은 76 4일 뒤, 4 출력
//temperatures[6],[7]은  더 따뜻해질 날이 없으므로 0 출력