package ch07.sec02;

// 자식클래스
public class SmartPhone extends Phone {
    public boolean wifi;

//    생성자 선언
//    부모클래스에서 model과 color를 상속받음.
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이상태ㅓ뱌ㅕㄴ경");
    }
    public void internet() {
        System.out.println("dls터넷연결 고.");
    }
}
