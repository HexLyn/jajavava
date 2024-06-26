package ch08.quiz12;


public class Example {
    private static C c;

    public static void action(A a) {
        a.method1();
        if(a instanceof C) {
            c.method2();
        }
    }
    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
