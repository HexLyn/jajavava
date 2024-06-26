package ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {
        for(int i= 0; i<10; i++) {
            System.out.println(i);
            if(i == 5 ) {
                System.out.println("강제종료");
//                System.exit은 프로세스를 강제로 종료시킨다. 0이 코드로 들어가면 정상종료 의미
                System.exit(0);
            }
        }
    }
}
