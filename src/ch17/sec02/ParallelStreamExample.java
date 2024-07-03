package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach( name -> {
            System.out.println(name + Thread.currentThread().getName());
        });
    }
}
