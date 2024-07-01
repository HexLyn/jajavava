package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
//        rent 내에서 반환받은 Home 객체를 저장해서 Home 클래스 내에 있는 메소드 호출.
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
//        rent 내에서 반환받은 Car 객체를 저장해서 Car 클래스 내에 있는 메소드 호출.
        Car car = carAgency.rent();
        car.run();
    }
}
