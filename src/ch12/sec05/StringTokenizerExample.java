package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
//        split으로 String 쪼개기
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");

        for(String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        // StringTokenizer 사용, 여기서는 단일 구분자만 사용할 수 있음
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
