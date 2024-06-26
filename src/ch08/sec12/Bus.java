package ch08.sec12;


public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("drive bus");
    }
    public void checkFare() {
        System.out.println("check fare");
    }
}
