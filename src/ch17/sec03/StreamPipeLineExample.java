package ch17.sec03;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("gg", 10),
                new Student("ee", 20),
                new Student("dd", 30)
                );

        Stream<Student> studentStream = list.stream();

        //        중간처리 (학생 객체를 점수로 매핑 후 int) 처리
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

        //        최종 처리(평균 점수)
        double avg = scoreStream.average().getAsDouble();
        System.out.println(avg);


//        메소드 체이닝을 이용해 코드를 이어줬다.
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}
