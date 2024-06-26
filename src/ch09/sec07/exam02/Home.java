package ch09.sec07.exam02;

public class Home {
//    RemoteControl 인터페이스를 상속받은
//    익명의 클래스를 만든 것과 동일하게 작동한다.
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };
//    메소드(필드 이용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}

