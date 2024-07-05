package ch18.sec08;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("길동이");
        dos.writeDouble(95.5);
        dos.write(1);

        dos.writeUTF("길동2");
        dos.writeDouble(92);
        dos.write(2);

        dos.flush(); dos.close(); fos.close();

//        DataInputStream 생성
        FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

//        기본 타입 입력
        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + score + order);
        }
        dis.close(); fis.close();
    }
}
