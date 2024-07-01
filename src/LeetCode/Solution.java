package LeetCode;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
//      정렬 -0(nlogn)
        Arrays.sort(participant);
        Arrays.sort(completion);

//        i 0~ n-1순회 - 0(n)
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}


//완주하지 못한 선수의 이름을 리턴.
//전체 참가 participant 배열과 완주자 completion이 주어질때,
//participant엔 있으나, completion엔 없는 사람을 출력한다.
//단순 중복제거면 동명이인 문제.

//그러면, 둘 다 정렬 한 뒤, 빼기를한다?