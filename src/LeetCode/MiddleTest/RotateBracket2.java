package LeetCode.MiddleTest;

import java.util.ArrayDeque;
import java.util.Deque;

class RotateBracket2 {
    public int solution(String s) {
        String extendedS = s+s;
        int answer = 0;

        for(int i =0; i< s.length(); i++){
            if(isValid(extendedS.substring(i,s.length()+i)))
                answer++;
        }

        return answer;
    }

    private boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char target = stack.pop();
                if (
                        (target == '(' && c != ')') ||
                        (target == '{' && c != '}') ||
                        (target == '[' && c != ']')
                ) return false;
            }
        }

        return stack.isEmpty();
    }
}
