package ch18.sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("Hello World");
//        %d 식으로 지정해줄 땐 printf사용.
        ps.printf("%6d %-10s %10s \n", 1 ,"홍길동", "도적");
        ps.printf("%6d %-10s %10s \n", 2 ,"홍2길동", "도적2");

        ps.flush();
        ps.close();

    }
}
