package LeetCode;

import java.util.*;

//for 문자열 회전.
//회전된 문자열을 isValid로 검증한다.

// 문자열 s가 주어진다.
public class RotateBracket {
    public int solution(String s) {
        String extendedS = s+s;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            // 주어진 문자열의 길이만큼 반복하며, isvalid가 참일 경우
            // answer++을 수행한다.
            if(isValid(extendedS.substring(i,s.length()+i))) answer++;
            // substring(startindex, endindex) start는 이상, end는 미만.
            // 위 코드에선 배열의 회전을 s+s에서
            // 원래길이 만큼 substring을 하는 것으로 표현.
            // A = abcde, A.substring(1,5)면 bcd 반환.
        }
        return answer;
    }

    private boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char current : s.toCharArray()) {
            // 들어온 문자열의 각 요소를 향상된 for문으로 current에 할당.

//            받아온 current가 열리는 괄호일 때 push,
            if(current=='(' || current=='{' || current=='[') {
                stack.push(current);
            } else {
                if(stack.isEmpty()) return false;
//                먼저, stack이 비었다면 false 반환.

//                닫히는 괄호일 땐 stack을 pop을 하며 target에 저장.
                char target = stack.pop();
                if ((target == '(' && current != ')') ||
                    (target == '{') && current != '}' ||
                    (target == '[') && current != ']') {
                        return false;
                }
            }
        }
        // for문이 끝난 뒤, stack이 비었는지 여부.
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