package ch02.sec06;

public class StringEX {
    public static void main(String[] args) {
        String name = "길동이";
        String job = "백수";
        System.out.println(name);
        System.out.println(job);

//        \" 으로 따옴표 이스케이프. 따옴표 자체를 출력.
        String str = "나는 \"밥\"을 먹습니다.";
        System.out.println(str);

        str = "number\tname\tjob";
        System.out.println(str);

//        print는 줄바꿈 없음.
        System.out.print("I\n");
        System.out.print("My\n");
        System.out.print("Me.");

    }
}
