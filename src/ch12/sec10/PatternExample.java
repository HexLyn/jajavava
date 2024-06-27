package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
//        Pattern.matches : 정규표현식으로 문자열을 검증해준다.
        boolean result = Pattern.matches(regExp,data);
        if(result) {
            System.out.println("정규식씨와 동일합니다.");
        } else {
            System.out.println("정규식시가 틀렸습니다.");
        }
//        .이 나와야 한다 명시해 놨지만 예제엔 .을 안넣었음 = 일치안함 출력.
        regExp = "\\w+@\\w+(\\.\\w+)+?";
        data = "hell@thiscompanycom";
        result = Pattern.matches(regExp,data);
        if(result) {
            System.out.println("정규식 최고");
        } else {
            System.out.println("일치안함");
        }
    }
}
