package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JYP");
        set.add("JAVA");
        set.add("iBATIS");

        Iterator<String> iterator = set.iterator();
//        hasNext : 다음으로 가져올 요소가 있으면 true, 없으면 false
        while (iterator.hasNext()) {
//            next: 요소들을 돌면서 객체를 하나씩 가져오기.
            String element = iterator.next();
            System.out.println(element);
//            요소들을 돌면서 iBATIS인지 체크
            if (element.equals("iBATIS")) {
//                조건에 일치하는 요소를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();

//        set에서 바로 해당 요소 제거 가능.
        set.remove("JAVA");

//        향상된 for문으로 객체를 하나씩 출력.
        for (String element : set) {
            System.out.println(element);
        }
    }
}
