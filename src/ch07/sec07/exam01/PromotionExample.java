package ch07.sec07.exam01;


    class A {
    }
    class B extends A {
    }
    class C extends A {
    }
    class D extends B {
    }
    class E extends C {
    }
public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

//      자식타입 객체를 부모타입 변수에 넣을 때
//      자동 타입 변환이 일어난다.
        A a1 =b;
        A a2 =c;
        A a3 =d;
        A a4 =e;

        B b1 =b;
        C c1 =c;

//        아래 두 행은 상속관계가 아닌걸 이어서 에러 발생.
//        B b3 = e;
//        C c2 =d;
    }






}
