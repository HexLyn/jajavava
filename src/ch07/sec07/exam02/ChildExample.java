package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
//      형태가 Parent로 되어있어. child에만 존재하는
//      method3은 이용할 수 없다.
//      부모타입은 자식 타입으로 자동 변환 되지 않기 때문에
//      컴파일 에러 발생.
//      parent.method3();
    }
}
