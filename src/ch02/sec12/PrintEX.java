package ch02.sec12;

public class PrintEX {
    public static void main(String[] args) {
        int value = 123;
//      souf 면 printf 단축키
//      sout은 println.
        System.out.printf("%d won\n", value);
        System.out.printf("%6d won\n", value);
        System.out.printf("%-6d won\n", value);
        System.out.printf("%06d won\n", value);

        double area = 3.14159265358979*10*10;
        System.out.printf("%d %10.2f\n", 10, area );

        String name = "hongonhg";
        String job = "homeless";
        System.out.printf("%6d|%-10s|%10s\n", 1 ,name, job);
    }
}
