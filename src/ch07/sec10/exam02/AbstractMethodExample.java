package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        CAT cat = new CAT();
        cat.sound();

        Dog dog = new Dog();
        dog.sound();

//        위의 두줄로 구성된 코드보다 아래가 더 좋은 형태.
        animalSound(new CAT());
        animalSound(new Dog());
    }

//    파라미터로 객체를 주입받아 다형성을 부여.
    public static void animalSound(Animal animal) {
        animal.sound(); //재정의된 메소드를 호출한다.
    }
}
