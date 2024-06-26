package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn="981111-1234567";
        String firstNum = ssn.substring(0,6);
//        배열 상 ssn[6]은 -이지만 하이픈은 출력되지 않았다.
//        0부터 5까지. 즉, substring(n,m)은 n부터 m-1까지 추출.
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
//        substring(n)은 n부터 끝까지 추출.
        System.out.println(secondNum);
    }
}
