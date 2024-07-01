package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JYP");
        set.add("Java"); //set에선 중복객체는 저장되지 않는다.
        set.add("iBATIS");

//        저장된 객체 수 출력 : 5가 아닌 4 반환.
        int size = set.size();
        System.out.println(size);
    }
}
