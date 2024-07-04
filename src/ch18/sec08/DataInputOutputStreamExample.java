package ch18.sec08;

import java.io.*;


public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("hong");
        dos.writeDouble(95.5);
        dos.write(1);

        dos.writeUTF("hong2");
        dos.writeDouble(92);
        dos.write(2);

        dos.flush(); dos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + score + order);
        }
        dis.close(); fis.close();
    }
}
