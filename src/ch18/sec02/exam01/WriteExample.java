package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:/temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

//            flush: 배치를 비워준다.
            os.flush();
//            close: 사용한 스트림을 닫아준다.
            os.close();
        } catch (IOException e) {
//            파일 입출력시 IOException 예외 처리 필수
            e.printStackTrace();
        }
    }
}
