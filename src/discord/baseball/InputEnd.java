package discord.baseball;
import java.util.Scanner;

public class InputEnd {
    private Scanner scanner;

    public InputEnd(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean shouldRestart() {
        while (true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String endNum = scanner.nextLine();

            switch (endNum) {
                case "1":
                    return true;
                case "2":
                    return false;
                default:
                    if (!endNum.equals("1") && !endNum.equals("2")) {
                        System.out.println("1 또는 2를 입력하세요.");
                    }
            }
        }
    }
}





//package baseball;
//
//public class InputEnd {
//    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
//    String EndNum = scanner.nextLine();
//    swith(EndNum) {
//        case 1:
//            InputRandom();
//            InputCompare = true;
//
//        case 2:
//    }
//}

//InputCompare에서 값을 모두 맞췄을 때 실행된다.
//1,2 이외의 값 입력 제한 =나중 추가사항