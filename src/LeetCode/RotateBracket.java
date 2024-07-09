package LeetCode;

import java.util.*;

//for 문자열 회전.
//회전된 문자열을 isValid로 검증한다.

public class RotateBracket {
    public int solution(String s) {
        String extendedS = s+s;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(isValid(extendedS.substring(i,s.length()+i))) answer++;
        }
        return answer;
    }
    private boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char current : s.toCharArray()) {
//            열리는 괄호일 때 push,
            if(current=='(' || current=='{' || current=='[') {
                stack.push(current);
            } else {
                if(stack.isEmpty()) return false;
//            닫히는 괄호일 땐 pop을 한다.
                char target = stack.pop();
                if ((target == '(' && current != ')') ||
                    (target == '{') && current != '}' ||
                    (target == '[') && current != ']') {
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


// (), [], {} 올바른 괄호 문자열.
// 문자열에서 모든 열린 괄호들이 닫혀야(And) 올바른 문자열.
// 괄호의 종류 구분 필요.
// 스택에 넣어서 판별하는건 동일.

// 올바르지 않은 문자열도 회전시키면서 올바른 문자열로 되는지 판별.

// = 반복문으로 올바른 괄호 문자열에 해당할때까지 돌린다.
//시작부터 충족하면 0회, 그 뒤로는 반복 횟수에 따라 증가.