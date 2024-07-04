package ch17.sec07.exam02;

import ch17.sec07.exam01.Student;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("dd", 30));
        studentList.add(new Student("dd2", 20));
        studentList.add(new Student("dd3", 10));

//      점수를 기준으로 오름차순으로 정렬한 스트림 얻기
        studentList.stream()
//                Student가 Comparable을 구현하지 않았으니 직접적인 compare 함수를 넣어줌.
//                s1이 s2보다 작으면 음수, 같으면 0, 크면 양수 리턴
                .sorted((s1,s2)-> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s-> System.out.println(s.getName()+ " " + s.getScore()));
        System.out.println();

//      점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기.
        studentList.stream()
                .sorted((s1,s2)-> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s-> System.out.println(s.getName() + " " + s.getScore()));
    }
}
