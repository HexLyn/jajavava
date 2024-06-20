package ch07.sec07.exam03;

public class ChildExample {

    public static void main(String[] args) {
//        객체 생성 및 자동 타입 변환.
        Parent parent = new Child();

//        Parent타입으로 필드와 메소드 사용.
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        강제 타입 변환
//        Child 타입으로 바꾸고 나서는 자식의 필드, 메서드
//        에 접근 가능.
        Child child = (Child) parent;
        child.method3();
        child.field2 = "data2";

    }
}
