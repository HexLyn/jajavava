package ch07.sec03.exam02;

// 자식클래스
public class SmartPhone extends Phone {


//    생성자 선언
//    부모클래스에서 model과 color를 상속받음.
    public SmartPhone(String model, String color) {
//       exam01과 다르게 기본생성자를 쓸 수 없게 되었다.
//        똑같이 값을 넣어준다. model, color(phone에서 받아온 것들).
        super(model, color);
//        this.model = model;
//        this.color = color;
//        zuper 키워드를 사용해서 받아온 model, color를 부모에게 넘겨줌.
//        이제 this로 받아올 필요가 없어서 this는 지운다.
        System.out.println("smartphone(string model, string color) 생성자실행됨");
    }

}
