package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZipString {
    public int solution(String s) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        char[] define = s.toCharArray();

        // 압축 기준
        for (int i = 0; i < define.length; i++) {
            // 압축 배열
            list.add(String.valueOf(define[i]));
            for(int j = 0; j < define.length; j++) {



            }
        }



        return answer;
    }
}

// 문자열에서 같은 값이 연속해서 나타나는 것을
// 그 문자의 개수와 반복되는 값으로
// 표현하여 더 짧은 문자열로 줄여서 표현하고자 한다.

// "aabbaccc"의 경우 "2a2ba3c"로 표현. 한번만 나타난건 1 생략.
// "ababcdcdababcdcd" 의 경우 문자열 1개로 안하고 2개로 하면
// "2ab2cd2ab2cd", 8개 단위로 자르면 "2ababcdcd"도 가능.
// 이 때 가장 짧게 압축하여 표현할 수 있는 방법.

// s의 길이는 1이상, 1,000이하. = 완전탐색??
// 길이 1은 생략, 길이 2, 3, 4,... 문자열로 압축가능한지 확인.
