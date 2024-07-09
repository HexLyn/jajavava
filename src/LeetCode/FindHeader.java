//package LeetCode;
//
//import java.util.Arrays;
//
//class Solution6 {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        String format = "";
//        int gilE = 0;
//        Arrays.sort(phone_book);
//
//            while(answer) {
//                for (let i = 0; i< phone_book.length; i++) {
//                    format = phone_book[i];
//                    gilE = phone_book[i].length();
//
//                }
//            }
//
//        return answer;
//    }
//}

//전화번호 목록
//구조대 : 119
//박준영 : 97 674 223
//지영석 : 11 9552 4421
//다음과 같은 예에서 구조대("119")는 지영석("11 9552 4421")의 접두사이다.
//(사이 띄어쓰기 고려안하고 접두어 찾는다.)

// 전화번호부에 적힌 전화번호를 담은 배열 phone_book가 매개변수로 주어진다.
// 어떤 번호가 다른 번호의 접두어인 경우 false, 아니면 true 리턴.
//      ["119", "97674223", "1195524421"]	false
//      ["123","456","789"]	                true
//      ["12","123","1235","567","88"]	    false

// 몇개나 겹치는지가 중요한게 아니라 있나, 없나를 false/true로 반환
// = 최대한 빨리 겹치는게 하나라도 있는지만 확인하면 오케이.
// 1. 길이가 짧은 것부터 길이의 오름차순으로 정렬, 비교


