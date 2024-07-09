package LeetCode;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop]=prices.length-pop-1;
        }

        return answer;
    }
}

// 초단위로 기록된 주식가격 저장된 배열 prices 주어짐.
//가격이 떨어지지 않은 기간이 몇초인지 return

// prices = [1, 2, 3, 2, 3]
// return = [4, 3, 1, 1, 0]
// prices[0]은 1, 1-2-3-2-3 끝까지 1보다 큼. =4리턴
// prices[1]도 2-3-2-3 끝까지 떨어지지는 않음 =3리턴
// prices[2]는 3으로 바로 1초뒤 떨어짐. =1 리턴
// prices[4]는 0초간 떨어지지 않음. =0 리턴

//stack.peek으로 top과 price[i]를 비교. price[i]가 더 크면 push해서 넣음.
//peek이 더 크면 줄어들었다는 뜻이니 pop하면서 기간 계산(stack의 사이즈 만큼 지속되었다).