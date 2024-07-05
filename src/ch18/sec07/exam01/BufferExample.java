package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
//        입출력 스트림 생성
        String originalFilePath1 =
//                src폴더에 /originalFile1,2.jpg 넣어놓는다.
                BufferExample.class.getResource("/originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

//        입출력 스트림, 버퍼 스트림 생성
        String originalFilePath2 =
                BufferExample.class.getResource("/originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

//        버퍼 사용 않고 복사
        long nonBufferTime = copy(fis, fos);
        System.out.println(nonBufferTime);

//        버퍼 사용하여 복사
        long BufferTime = copy(bis, bos);
        System.out.println(BufferTime);

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
    public static long copy(InputStream is, OutputStream os) throws Exception {
//        시작 시간 저장
        long start = System.nanoTime();

//        1바이트를 읽고 1바이트 출력
//        받아온 데이터를 그대로 출력함.
        while(true) {
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
//        끝 시간 저장
        long end = System.nanoTime();
//        복사 시간 리턴(걸린 시간)
        return (end-start);
    }
}
