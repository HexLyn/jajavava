package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

//    range, rangeClosed의 차이 : range는 끝 부분을 포함하지 않는다.
//    range(1,100)이면 1이상, 100미만.
//    rangeClosed(1,100)이면 1이상 100이하.
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->sum+= a);
        System.out.println(sum);
    }
}
