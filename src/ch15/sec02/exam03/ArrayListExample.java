package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList, LinkedList 컬렉션 객체 생성.
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

//        시작,끝 시간을 저장할 변수 선언.
        long startTime;
        long endTime;

//        ArrayList 컬렉션에 저장하는 시간 측정.
//        삽입 메소드기 때문에 ArrayList의
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList timeconsume", (endTime-startTime));

//        LinkedList 컬렉션에 저장하는 시간 측정.
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList timeconsume", (endTime-startTime));
    }
}
