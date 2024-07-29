package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ArrayElementsLength {
    public List<Integer> solution(String[] strlist) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < strlist.length; i++) {
            char[] str = strlist[i].toCharArray();
            list.add(str.length);
        }
        return list;
    }
}

// 문자열 배열 strlist가 주어질 때, 각 원소의 길이를 담은 배열 반환.

//희표
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(String[] strList) {
//        return Arrays.stream(strList)
//        .mapToInt(String::length)
//        .toArray();
//    }
//}

//Filtering, Mapping, Sorting