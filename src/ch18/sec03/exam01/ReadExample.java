package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {
            while(true) {
//                파일을 1byte씩 읽어온다.
                int data = is.read();
//                byte를 모두 읽어오면 -1을 리턴하므로 이 때 break
                if(data == -1) break;
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
//            파일을 제대로 찾지 못했을 경우 예외처리.
            e.printStackTrace();
        } catch (IOException e) {
//            입출력이 제대로 동작하지 않았을 경우 예외처리.
            e.printStackTrace();
        }
    }
}
