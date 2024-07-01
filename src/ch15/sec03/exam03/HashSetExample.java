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
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("iBATIS")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JAVA");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
