package ch09.sec04.exam01;

//생성자
public class A {
    A() {
        class B{}
        B b = new B();
    }
//    메서드
    void method() {
        class B {}
        B b = new B();
    }
}

