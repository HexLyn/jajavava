package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9811111234567";
//        String 에 length()를 사용하면
//        해당 문자열의 길이를 반환한다.
        int length = ssn.length();
        if(length == 13) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
