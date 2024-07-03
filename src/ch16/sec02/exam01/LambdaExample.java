package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()->{
            System.out.println("출근을 합니다.");
            System.out.println("집을 갑니다.");
        });

        person.action(()-> System.out.println("이미 집입니다."));
    }
}
