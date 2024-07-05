package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";
        try(
                InputStream is = new FileInputStream(originalFileName);
                OutputStream os = new FileOutputStream(targetFileName)
                ) {

//            배열 버퍼 생성
            byte[] data = new byte[1024];

            while(true) {
//                최대 배열 크기인 1024바이트 읽기.
                int num = is.read(data);
                if(num == -1) break;

//                배열의 앞부분만 잘라서 해당 경로의 파일에 저장함.
//                num만큼 데이터 파일 쓰기
                os.write(data, 0, num);
            }
//            내부 버퍼 잔류 바이트를 출력하고 바이트를 비워준다.
            os.flush();

            System.out.println("copy completed");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
