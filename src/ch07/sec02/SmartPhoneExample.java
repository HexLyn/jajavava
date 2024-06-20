package ch07.sec02;
//phone클래스의 자식클래스
public class SmartPhoneExample {
    public static void main(String[] args) {
//        객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

//        phone으로부터 상속받은 필드 읽기.
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println(myPhone.wifi);

//        phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendvoice("어이");
        myPhone.receiveVoice("왜");
        myPhone.sendvoice("하하하");
        myPhone.hangup();

//        smartphone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
