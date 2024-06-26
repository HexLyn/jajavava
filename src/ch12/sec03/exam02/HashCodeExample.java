package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1,"홍길동");
        Student s2 = new Student(1,"홍길동");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
//        원래 new로 생성하면 객체의 메모리 번지 기반인 hash는 다른 주소가 할당된다.
//        하지만 본 문제에서는 Student에서 "홍길동"의 메모리주소와 no가 모두 같아
//        hashCode()도 동일한 값을 가진다.

        if(s1.hashCode() == s2.hashCode()) {
            if(s1.equals(s2)) {
                System.out.println("동등 객체");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        } else {

            System.out.println("해시코드가 달라요");
        }
    }
}
