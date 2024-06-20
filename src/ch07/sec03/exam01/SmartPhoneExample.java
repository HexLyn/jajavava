package ch07.sec03.exam01;

//phone클래스의 자식클래스
public class SmartPhoneExample {
    public static void main(String[] args) {
//        객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

//        phone으로부터 상속받은 필드 읽기.
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
    }}

