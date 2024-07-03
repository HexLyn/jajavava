package ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

//        Stream을 이용한 요소 반복 처리(set을Stream으로 변환해 저장)
        Stream<String> stream = set.stream();
//        Stream을 돌면서 요소를 name이란 이름으로 가져와 출력.
        stream.forEach( name -> System.out.println(name));
    }
}
