package ch03.sec06;

public class CompareOperatorEX {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result = (num1 == num2);
        boolean result2 = num1 != num2;
        boolean result3 = num1 <= num2;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        char ch1 = 'A';
        char ch2 = 'B';
//        A와 B의 아스키 코드값으로 비교하게 된다.
        boolean result4 = (ch1 < ch2);
        System.out.println(result4);

        int num3 = 1;
        double num4 = 1.0;
//        더 큰 double로 형이 바뀌어 같다고 인식 된다.
        boolean result5 = (num3 == num4);
        System.out.println(result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
//        직접 형을 바꿔줘야 같다고 인식함.
        boolean result7 = (num5 == (float)num6);
        System.out.println(result6);
        System.out.println(result7);

        String str1 = "자바";
        String str2 = "JAVA";
//        문자열 끼리 비교하므로 equals 사용.
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println(result8);
        System.out.println(result9);
    }
}
