package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        CAT cat = new CAT();
        cat.sound();

        animalSound(new Dog());
        animalSound(new CAT());
    }
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
