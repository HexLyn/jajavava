package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4 ,5 };

        // IntStream을 생성
        IntStream intStream = Arrays.stream(intArray);
        // asDoubleStream()을 사용하여 DoubleStream으로 변환하고 각 요소를 출력
        intStream.asDoubleStream()
                .forEach(d-> System.out.println(d));

        System.out.println();

        // 원본 intArray를 다시 IntStream으로 변환 (이전 스트림은 소비되었으므로 재생성 필요)
        intStream = Arrays.stream(intArray);
        // boxed()를 사용하여 각 int 요소를 Integer 객체로 변환하고 출력

        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }
}
