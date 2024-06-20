package ch07.sec02;
// 부모클래스
public class Phone {

    public String model;
    public String color;

    public void bell() {
        System.out.println("linging");
    }
    public void sendvoice(String message) {
        System.out.println("you : " + message);
    }
    public void receiveVoice(String message) {
        System.out.println("other : " + message);
    }
    public void hangup() {
        System.out.println("cut line");
    }
}

