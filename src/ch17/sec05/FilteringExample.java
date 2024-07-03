package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); //중복
        list.add("B");
        list.add("A"); //중복
        list.add("D");
        list.add("E");

//        forEach로 돌면서 중복 요소 제거
        list.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
        System.out.println();

//        A로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(n-> System.out.println(n));
        System.out.println();

//        중복요소를 먼저 제거하고, A로 시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(n-> n.startsWith("A"))
                .forEach(n-> System.out.println(n));
    }
}
