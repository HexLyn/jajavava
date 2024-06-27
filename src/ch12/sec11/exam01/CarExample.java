package ch12.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
//        클래스 가져오기1. class static 필드 이용
        Class clazz = Car.class;
//        클래스 가져오기1. class static 필드 이용
//        Class clazz = Class.forName("ch12.sec11.examp01.Car");
//        클래스 가져오기3. 인스턴스 이용
//        Car car = new Car();
//        Class clazz = car.getClass();

        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
    }
}
