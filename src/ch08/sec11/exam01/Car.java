package ch08.sec11.exam01;

public class Car {
    Tire tire1 = new HankokTire();
    Tire tire2 = new HankokTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
