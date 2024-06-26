package ch11.sec06;

//extends는 상속, Exception을 상속하고 있다.
//기본생성자, 예외 메시지를 입력받는 생성자.
public class InsufficientException extends Exception {
    //기본생성자
    public InsufficientException() {}

    //예외 메시지를 입력받는 생성자.
    public InsufficientException(String message) {
        super(message);
    }
//    같은 클래스 2개 = 생성자 오버로딩?
}
