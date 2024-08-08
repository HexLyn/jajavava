package LeetCode;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //주어진 배열  prices의 길이를 가진 빈 배열 answer 생성

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            // stack이 비어있지 않고, [스택의 top]번째 prices가 prices[i]보다 크다면
            // 스택의 맨 위에 있는 값을 반환하며, 정수 pop에 넣는다.
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            // stack 정수 i를 넣는다.
            stack.push(i);
        }
        // prices = [1, 2, 3, 2, 3] 라면,
        // i=0에서 stack은 비어있으므로 바로 push,
        // answer = [0,0,0,0,0], stack = [0]

        // i=1에서 stack은 비어있지않지만(!stack.isEmpty()),
        // prices[stack.peek()]=prices[0]=1 > prices[1]=2. 불충족.
        // stack.push(1) 로 answer = [0,0,0,0,0], stack = [0,1]

        // i=2에서 stack은 비어있지않고(!stack.isEmpty()),
        // prices[1]=2 > prices[2]=3. 으로 이번에도 불충족.
        // stack.push(2) 로 answer = [0,0,0,0,0], stack = [0,1,2]

        // i=3에서 stack은 비어있지않고(!stack.isEmpty()),
        // prices[2]=3 > prices[3]=2. 조건 충족.
        // int pop = stack.pop() 수행 => pop=2, stack = [0,1].
        // answer[2] = 3-2 = 1 저장. answer = [0,0,1,0,0]
        // for문 밖의 stack.push(3) 수행, stack = [0,1,3]

        // i=4에서 stack은 비어있지않고(!stack.isEmpty()),
        // prices[3]=2 > prices[4]=3 조건 불충족.
        // stack.push(4)로, answer = [0,0,1,0,0], stack = [0,1,3,4]
        // for문 종료.

        // for문에서는 '주식 가격이 떨어졌을 경우'를 처리해준다.
        // 이후 while문에서 떨어지지 않은 경우를 계산.

        while (!stack.isEmpty()) {
            //stack이 빌 때까지 수행.
            int pop = stack.pop();
            answer[pop]=prices.length-pop-1;
        }
        // answer = [0,0,1,0,0], stack = [0,1,3,4].

        // 첫회전.
        // int pop=4, stack=[0,1,3]
        // answer[4] = 5-4-1 = 0 => answer = [0,0,1,0,0]

        // 두번째 회전.
        // int pop=3, stack=[0,1]
        // answer[3] = 5-3-1=1 => answer = [0,0,1,1,0]

        // 세번째 회전.
        // int pop=1, stack=[0]
        // answer[1]=5-1-1=3 => answer = [0,3,1,1,0]

        // 네번째 회전.
        // int pop = 0, stack = []
        // answer[0]=5-0-1=4 => answer = [4,3,1,1,0]

        //stack.isEmpty() 이므로 종료. return answer;
        return answer;
    }
}

// 초단위로 기록된 주식가격 저장된 배열 prices 주어짐.
// 가격이 떨어지지 않은 기간이 몇초인지 return

// prices = [1, 2, 3, 2, 3]
// return = [4, 3, 1, 1, 0]
// prices[0]은 1, 1-2-3-2-3 끝까지 1보다 큼.
// 끝까지 오르기만 했으니 떨어지지 않은 것.=4리턴

// prices[1]도 2-3-2-3 끝까지 떨어지지는 않음 =3리턴
// prices[2]는 3으로 바로 1초뒤 떨어짐. =1 리턴
// prices[4]는 0초간 떨어지지 않음. =0 리턴

//stack.peek으로 top과 price[i]를 비교. price[i]가 더 크면 push해서 넣음.
//peek이 더 크면 줄어들었다는 뜻이니 pop하면서 기간 계산(stack의 사이즈 만큼 지속되었다).