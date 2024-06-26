package ch12.sec04;

public class ErrExample2 {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode =0;
        while(true) {
//            ASCII코드값으로 인식한다.
//            Enter키를 읽지 않았을 경우에만 실행.
            if(keyCode != 13 && keyCode != 10) {
//                아스키 코드 10은 Carriage Return, \r
//                아스키 코드 13은 Line Feed \n
//                두 코드의 결합 \r\n은 윈도우 스타일의 줄바꿈 의미
                if(keyCode == 49) { //숫자 1을 읽었을 때.
                    speed++;
                } else if(keyCode == 50) { //숫자 2를 읽었을 때.
                    speed--;
                } else if(keyCode == 51) { //숫자 3을 읽었을 때.
                    break;
                }
                System.out.println("mmmmmmmmmmmmmmmmmmmm");
                System.out.println("1.증속 2.감속 3.중지");
                System.out.println("현재 속도 = " + speed);
                System.out.println("선택: ");
            }
//            키를 하나씩 읽음.
            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
