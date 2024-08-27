import java.util.*;

class ZipString {
    public int solution(String s) {
        //✅ 압축된 문자열 길이들 중 가장 짧은 길이를 반환한다.
        int result = s.length();
        for (int l = 1; l <= s.length() / 2; l++) {
            result = Math.min(result, compress(s, l));
            // for문 내에서 compress 메서드를 돌리며 최소값을 result에 저장한다.
            // l은 잘라낼 블록 단위(길이), s는 주어진 문자열
        }
        return result;
    }

    int compress(String text, int length) {
        //✅ 현재 압축 단위에 따라 문자열을 나눈다.
        List<String> words = new ArrayList<>();
        for (int i = 0; i < text.length(); i += length) {
            // text를 length단위로 substring 한다.
            words.add(text.substring(i, Math.min(text.length(), i + length)));
            // words 배열에 더한다.
            // text에서 substring해서 잘라낸 문자열 블록들을.
        }
        StringBuilder compressed = new StringBuilder();
        String prevWord = "";
        int count = 0;
        for (String word : words) {
            // word라는 문자열에 위에서 만든 words배열의 요소들을 하나하나 배정해간다.
            //✅ 이전 부분 문자열과 현재 부분 문자열을 비교한다.
            if (word.equals(prevWord)) {
                //✅ 만약 같다면, 이전 부분 문자열의 중복 개수를 1 증가시킨다.
                count++;
            } else {
                //✅ 만약 다르다면, 이전 부분 문자열의 중복 개수와 문자열을 압축 문자열에 이어붙인다.
                if (count > 1) {
                    // append는 문자열의 마지막에 추가하는 메서드이다.
                    compressed.append(String.valueOf(count));
                }
                compressed.append(prevWord);
                //✅ 현재 부분 문자열을 이전 부분 문자열로 지정하고, 중복 개수를 1로 설정한다.
                prevWord = word;
                count = 1;
            }
        }
        //✅ 마지막 부분 문자열을 처리한다.
        if (count > 1) {
            compressed.append(String.valueOf(count));
        }
        compressed.append(prevWord);
        return compressed.toString().length();
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

//for i for j
//substring(i, j)

// 문자열을 압축하여 가장 짧은 길이를 반환하는 문제.
// 압축 방식으로 문자열을 특정 길이의 블록으로 나누고,
// 동일한 블록이 연속해서 나타날 경우 이를 숫자와 블록의 조합으로 대체하여 길이를 줄이는 방식.

