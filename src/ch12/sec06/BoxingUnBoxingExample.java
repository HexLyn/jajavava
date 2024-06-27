package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
//        Boxing(primitive => wrapper)
        Integer obj = 100;
//        박싱된 래퍼 객체에서 해당 값을 꺼내려면 해당 객체 안에 한번 더 접근해야 한다.
        System.out.println(obj.intValue());

//        UnBoxing(wrapper => primitive)
        int value = obj;
        System.out.println(value);
//      연산 시 UnBoxing
        int result = obj + 100;
        System.out.println(result);
    }
}
