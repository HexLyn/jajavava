package LeetCode;

import java.util.*;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> counter = new HashMap<>();

        //✅ participant를 순회하며 해시테이블에 이름, 인원수를 저장한다.
        for (String p : participant) {
            counter.put(p, counter.getOrDefault(p, 0) + 1);
        }

        //✅ completion을 순회하며 해시테이블의 인원수를 감소시킨다.
        for (String c : completion) {
            counter.put(c, counter.get(c) - 1);
        }

        //✅ participant를 순회하며 인원수가 0인 이름을 찾아 반환한다.
        for (String key : counter.keySet()) {
            if (counter.get(key) != 0) {
                return key;
            }
        }

        return null;
    }
}
