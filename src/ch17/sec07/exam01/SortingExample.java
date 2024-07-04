package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
//        List 컬렉션 생성.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("dd", 30));
        studentList.add(new Student("dd2", 20));
        studentList.add(new Student("dd3", 10));

//        점수를 기준으로 오름차순 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted()
//                sorted: compareTo에 적힌 기준으로 요소들을 비교해서 정렬
//                점수 순으로 정렬하여 출력.
                .forEach(s-> System.out.println(s.getName() + s.getScore()));
        System.out.println();
    }
}
