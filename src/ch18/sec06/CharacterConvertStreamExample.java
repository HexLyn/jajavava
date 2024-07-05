package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문변스사");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
//        Output은 출력, 해당 경로를 가진 출력 스트림을 만들어줌.
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//        OutputStreamWriter는 바이트 스트림을 문자열 스트림으로 사용하기 위한
//        보조스트림이다. 이를 통해 연결해줌.
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }
//    위의 동작들을 통해 write("문변스사")가 해당 경로 파일에 쓰여진다.


    public static String read() throws Exception {
//        해당 경로를 가진 입력 스트림.
        InputStream is = new FileInputStream("C:/Temp/test.txt");
//        바이트 스트림을 문자열 스트림으로 사용하기 위해 보조스트림으로 연결해줌.
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }
//    값을 읽어준다.
}
