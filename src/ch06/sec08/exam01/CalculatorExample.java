package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

//        리턴하는 값이 있어야 변수가 저장이 된다.
//        void는 저장을 못한다.
        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 :" + result1);

        int x=10;
        int y=4;

        double result2 = myCalc.divide(x,y);
        System.out.println("result2 :" + result2);

        myCalc.powerOff();
    }
}
