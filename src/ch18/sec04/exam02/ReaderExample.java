package ch18.sec04.exam02;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

//            한 문자씩 읽기
            System.out.println("한 문자씩 읽기");
            reader = new FileReader("C:/Temp/test.txt");
            while(true) {
                int data = reader.read();
                if(data == -1) break;
                System.out.println((char)data);
            }
//           reader를 다 사용하고 나서 close를 해준다.
            reader.close();
            System.out.println();

//            문자 배열로 읽기
            System.out.println("문자 배열로 읽기");
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while(true) {
                int num = reader.read(data);
                if(num == -1) break;
                for(int i=0; i<num; i++) {
//                    터미널에서 해당 파일 내용 출력.
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
