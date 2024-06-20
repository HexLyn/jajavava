package ch07.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
//       FlyMode의 기본값이 normal이므로 airplane의 fly메서드 호출

        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
//        static, 상수값이여서 sa가 아닌 클래스명으로 접근했다.
//       if문을 통해 자식에 있는 코드가 실행됨.

        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
