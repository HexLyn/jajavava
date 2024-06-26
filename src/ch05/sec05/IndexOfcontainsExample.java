package ch05.sec05;

public class IndexOfcontainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
//        자, 바, ""(공백) 다음에 "프로그래밍"이 있으므로
//        subject[3], 3이 출력된다.

        String substring = subject.substring(location);
        System.out.println(substring);
//        "자바 프로그래밍" 에서 location(3)까지 뺀다.
//        자, 바, ""(공백)이 삭제된다. 결과는 "프로그래밍"

        location = subject.indexOf("자바");
//        "자바"라는 글자가 subject에 없으면 -1 반환.
//        있다면 해당 문자열의 위치 반환. "자바"는 0
//        "프"는 3.
        if(location != -1) {
            System.out.println("java book");
            System.out.println(location);
        } else {
            System.out.println("non java book");
        }
//        location은 subject에서 "자바"문자열을 찾는다.
//        해당 문자열이 존재하므로 -1이 아닌 값이 반환.

        boolean result = subject.contains("자바");
        if(result) {
            System.out.println("자바 관련");
        } else {
            System.out.println("비 자바 관련");
        }
//        contatins는 boolean 값으로 반환하게 됨.
//        contains의 경우 포함여부 결과만 알고 싶을 때 사용.
    }
}
