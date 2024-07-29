package LeetCode;

class CtrlZ {
    public int solution(String s) {
        int answer = 0;
        String[] elements = s.split(" ");
        int lastNumber = 0;

        for (String element : elements) {
            if (element.equals("Z")) {
                answer -= lastNumber;
            } else {
                lastNumber = Integer.parseInt(element);
                answer += lastNumber;
            }
        }

        return answer;
    }
}


// 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어진다.
// 문자열에 있는 숫자를 차례로 더함.
// 이 때, "Z"가 나오면 바로 전에 더했던 숫자를 뺀다.
// s는 숫자, "Z", 공백으로 구성.
// 연속된 중복, "Z"는 나오지 않음.
// Z로 시작하지는 않음.

// 다음에 스택 활용해볼 것.
//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) {
//                stack.pop();
//            } else {
//                stack.push(Integer.parseInt(w));
//            }
//        }
//        for (int i : stack) {
//            answer += i;
//        }
//        return answer;
//    }
//}