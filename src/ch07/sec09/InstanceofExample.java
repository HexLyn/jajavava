package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name:" + person.name);
        person.walk();


//        instanceof = person이 참조하는 객체가 Student에 있음.
        /*
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("studentNo" + student.studentNo);
            student.study();
        }
        */
//

//        위 코드와 동일하지만 Java12부터 사용 가능한 코드.
        if (person instanceof Student student) {
            System.out.println("student :" + student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args) {
//        Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
//        static은 언제나 제일 먼저 잡힌다.
//        이 코드에서 personInfo(p1)이 static이 아니라면
//        static인 main문에서 위의 코드를 불러올 수 없다.
//        이 때문에 둘 다 static으로 잡아 놓는다.
        personInfo(p1);

        System.out.println();

//        Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
