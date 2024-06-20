package ch03.sec04;

public class AccuracyEX1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

//        부동소수점의 경우 이진수의 한계로 정확한 계산이 안됨.
        double result = apple - number * pieceUnit;
        System.out.println(result);
    }
}
