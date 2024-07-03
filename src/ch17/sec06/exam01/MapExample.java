package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
//        List 컬렉션 생성.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동",85));
        studentList.add(new Student("홍길동",34));
        studentList.add(new Student("홍길동",10));

//        Student를 scroe 스트링으로 변환.
        studentList.stream()
                .mapToInt(s-> s.getScore())
                .forEach(score -> System.out.println(score));
    }
}
