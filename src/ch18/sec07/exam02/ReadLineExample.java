package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
        );

        int lineNo = 1;
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNo + "\t" + str);
//            한 줄 씩 줄번호 + \t(tab, 네 칸 띄기) + 코드 내용 이 출력된다.
            lineNo++;
        }
        br.close();
    }
}
