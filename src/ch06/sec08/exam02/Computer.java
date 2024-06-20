package ch06.sec08.exam02;

public class Computer {
    int sum(int ...values) {
        int sum=0;
        for(int i=0;i<values.length; i++) {
            sum +=values[i];
        }
        return sum;
    }
//    합산 결과를 리턴해줘야 한다.
}
