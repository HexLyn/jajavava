package ch02.sec09;

public class StringConcatEX {
    public static void main(String[] args) {
//        일반적인 숫자 계산 20
        int result1 = 10+ 2 + 8;
        System.out.println(result1);
//        12+문자열 8 = 128
        String result2 = 10 + 2 + "8";
        System.out.println(result2);
//   `    10+문자열 2 = 102, 여기에 8도 문자로 결합 1028
        String result3 = 10 + "2" + 8;
        System.out.println(result3);
//        문자열 10 + 2로 102, 여기에 8도 문자로 1028
        String result4 = "10" + 2 + 8;
        System.out.println(result4);
//        괄호 해놨으니 먼저함. 문자열 10+10으로 1010
        String result5 = "10" + (2 + 8);
        System.out.println(result5);
    }
}
