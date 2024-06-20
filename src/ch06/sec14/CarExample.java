package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

//        잘못된 값이 들어갔을 경우 set메소드에서 0으로 처리해준다.
//        캡슐화 해준다.
        myCar.setSpeed(-60);
        System.out.println(myCar.getSpeed());


        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println(myCar.getSpeed());
    }
}
