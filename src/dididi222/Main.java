package dididi222;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str= sc.next();
            char[] check = str.toCharArray();

            // 아스키 코드ㅡ 97~122가 a-z, 65-90이 A-Z
            for(int i=0 ; i<check.length; i++) {
                if(check[i]>='A'&&check[i]<='Z') {
                    check[i]=(char)(check[i]+32);
            // A65를 a97로 바꾸려면, 32를 더한다.
                } else if(check[i]>='a'&&check[i]<='z') {
                    check[i]=(char)(check[i]-32);
                }
            }
            System.out.println(check);
        }
}

