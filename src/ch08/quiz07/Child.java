package ch08.quiz07;

public class Child extends Parent {
        public String name;

        public Child() {
            this("홍길동");
            System.out.println("Child() call");
        }

        public Child(String name) {
            this.name = name;
            System.out.println("Child(String nation) call");
        }
    }
