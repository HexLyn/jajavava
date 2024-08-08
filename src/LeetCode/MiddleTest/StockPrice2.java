package LeetCode.MiddleTest;

import java.util.Stack;

public class StockPrice2 {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < prices.length; i++) {
                while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                    int pop = stack.pop();
                    answer[pop] = i - pop;
                }
                stack.push(i);
            }

            while(!stack.isEmpty()) {
                int pop=stack.pop();
                answer[pop] = prices.length - pop - 1;
            }

            return answer;
        }
    }

