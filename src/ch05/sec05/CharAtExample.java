package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9811111234567";
        char sex = ssn.charAt(6);

//     charAt으로 인덱스 6번 째 위치한 글자를 뽑아냄.
//     물론 시작은 0부터니 실제로 7번째 주민등록 성별 코드 출력
        switch (sex) {
            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
                break;
        }
    }
}
