package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;


public class ValidParentheses {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        boolean answer = true;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}

//String s를 받는다. 괄호들을 받는데,
//'(' ')' '{' '}' '[' ']' 괄호, 중괄호 대괄호들
//제공받으면 반드시 같은 괄호로 닫혀야 한다.

// (, {, [ 가 오면(열린괄호) 반드시 닫혀야 함.

//Example 1:
//Input: s = "()"
//Output: true

//Example 2:
//Input: s = "()[]{}"
//Output: true

//Example 3:
//Input: s = "(]"
//Output: false