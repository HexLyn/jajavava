package ch07.sec03.exam02;
// 부모클래스


public class Phone {

    public String model;
    public String color;
public Phone(String model, String color) {
//    부모의 필드를 초기화하는 코드기 때문에 부모클랫그에 넣어주는 것이 좋다.
    this.model = model;
    this.color = color;
    System.out.println("Phone 생성자 실행");
}


}

