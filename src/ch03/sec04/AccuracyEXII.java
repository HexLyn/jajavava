package ch03.sec04;

public class AccuracyEXII {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple*10;
        int number = 7;

//        정확한 계산을 위해 정수 연산으로 변환해준다.
        int result = totalPieces - number;
        System.out.println(result);
        System.out.println(result/10.0);
    }
}
