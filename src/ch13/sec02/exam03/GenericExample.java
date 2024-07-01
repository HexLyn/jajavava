package ch13.sec02.exam03;

public class GenericExample {
    public static void main(String[] args) {
//        타입을 명시하지 않아 Object로 간주점프.
        Box box1 = new Box();
//        해당 객체 content 타입은 String이 된다.
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

//        해당 코드에서 box1이 해당 객체가 되고 box2는 other가 된다.
//        compare 사용 시 box1의 content의 box2의 content가 같은지 비교.
        boolean result1 = box1.compare(box2);
        System.out.println(result1);

        boolean result2 = box1.compare(box3);
        System.out.println(result2);
    }
}
