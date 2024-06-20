package ch07.sec03.exam01;

// 자식클래스
public class SmartPhone extends Phone {


//    생성자 선언
//    부모클래스에서 model과 color를 상속받음.
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("smartphone(string model, string color) 생성자실행됨");
    }

}
