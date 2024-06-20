package ch02.sec02;

public class IntLiteralEX {
    public static void main(String[] args) {
        int var1 = 0b1011;
        int var2 = 00206;
//        8진수는 앞에 0을 붙인다.
//        아니면 가독성위해서 00 두개로 붙여도 작동함.
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
    }
}
