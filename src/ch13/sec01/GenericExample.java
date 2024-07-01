package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        // 앞에 타입이 들어가면 뒤 <>안에 타입은 생략 가능하다.(타입 추론)
        //Box 생성 시 타입파라미터(T) 대신 String으로 대체.
        box1.content = "Hello World";
        String str = box1.content;
        System.out.println(str);

//        제네릭에 들어가는 타입은 무조건 참조형식.
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
