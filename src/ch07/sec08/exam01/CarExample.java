package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

//        Tire 객체 하나를 생성해서 Car 클래스의 tire필드에 넣어줌.
//        tire 객체 장착.
//다형성 예제
        myCar.tire  = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
