package ch02.sec13;

import java.util.Scanner;

public class scannerEX {
    public static void main(String[] args) throws Exception {
//        스캐너 클래스를 이용해 새로운 스캐너 객체 생성.
        Scanner scanner = new Scanner(System.in);

        System.out.println("x : ");
//        스캐너로 한 줄을 입력받아 strX에 저장.
        String strX=scanner.nextLine();
//        받아온 strX를 int로 형 변환.
        int x=Integer.parseInt(strX);

        System.out.println("y : ");
        String strY=scanner.nextLine();
        int y=Integer.parseInt(strY);
//        int strY=scanner.nextInt(), 한 번에 int로
        int result = x + y;
        System.out.println("x+y " + result);
        System.out.println();

        while(true) {
            System.out.print("입력 문자열:");
            String data=scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력문자열: " + data);
            System.out.println();
        }
        System.out.println("end");
    }
}
