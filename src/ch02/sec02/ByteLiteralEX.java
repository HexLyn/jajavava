package ch02.sec02;

public class ByteLiteralEX {
    public static void main(String[] args) {
        int var1 = -128;
        int var2 = -30;
        int var3 = 0;
        int var4 = 30;
        int var5 = 127;
//        int var6 = 128;
//      var6은 값을 초과했다(-128~127), 컴파일 에러 발생.

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

    }
}
