package ch07.sec10.examp01;

public abstract class Phone {
    String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void turnOn() {
        System.out.println("폰 전원을 켠다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끈다.");
    }
}
