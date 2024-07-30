package LeetCode;

import java.util.*;

public class DistinctString {
    public String solution(String my_string) {
        Set<Character> seen = new HashSet<>();
        StringBuilder answer = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (!seen.contains(c)) {
                // seen 해시셋에 c를 추가한다.
                seen.add(c);

                // answer 마지막에 c를 넣는다.
                answer.append(c);
            }
        }
        //해시셋은 중복 불가. 해시셋 seen에 c가 포함되지 않았다면,
        //seen, answer 에 c를 넣는다.
        //중복된 것은 if문 조건, !seen.contatins(c)에서 걸러진다.

        // String은 불변, StringBuilder는 가변.
        // 그렇기에 Stringbuilder로 변형을 준 뒤 String으로 변환한다.
        return answer.toString();
    }
}

// 문자열 my_string이 주어진다.
// 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 반환.
// 공백도 하나의 문자로 구분
// 대소문자 구분
// 중복된 문자 중 가장 앞에 있는 문자를 남김.

//public class DistinctString {
//    public String solution(String my_string) {
//
//        String[] seek = my_string.split("");
//        ArrayList<String> answer =
//                new ArrayList<String>(Arrays.asList(seek));
//
//       for (int i = 0; i < answer.size(); i++) {
//           String eyes = answer.get(i);
//           for(int j=0; j< seek.length; j++){
//               if(eyes.get(i) == answer.get(j)){
//                   answer.remove(j);
//               }
//           }
//       }
//        return answer;
//    }
//}