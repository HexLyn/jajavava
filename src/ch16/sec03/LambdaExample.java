package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

//        매개 변수가 두 개일 경우, 괄호 생략 불가능
//        action을 부르고 있으므로 람다식은 workable 내의 work에 들어감.
        person.action((name, job) -> {
            System.out.println(name + " 이/가");
            System.out.println(job + "취업을 했대요.");
        });
        person.action((name, job) -> System.out.println(name + job));

        person.action2(word ->
            System.out.println(word)
        );
        person.action2(word -> System.out.println(word));
    }
}

