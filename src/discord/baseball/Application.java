package discord.baseball;

import java.util.Random;
import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public static void main(String[] args) {
        // 프로그램 구현
        Application app = new Application();
        app.startGame();
    }

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
//        InputCompare에서 true를 반환하여 종료되는 형식.
        boolean gameEnd = false;
//        랜덤값 생성, 본게임 컨테이너.
        while (true) {
            InputRandom inputRandom = new InputRandom(random);
            int[] computer = inputRandom.generateRandomNumbers();

            InputAnswer inputAnswer = new InputAnswer(scanner);
            gameEnd = false;

//            gameEnd가 false인 동안 반복수행(InputAnswer 정답기입).
            while (!gameEnd) {
                int[] inputnum = inputAnswer.getInput();
                gameEnd = InputCompare.compareNumbers(computer, inputnum);
            }

            InputEnd inputEnd = new InputEnd(scanner);
            if (!inputEnd.shouldRestart()) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}




//package baseball;
//
//public class Application {
//    Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//         TODO: 프로그램 구현
//        Application app = new Application();
//
//        int inputnum = app.InputAnswer();
//        int inputend = app.InputEnd();
//
//        System.out.println("숫자 야구 게임을 시작합니다.");
//        InputRandom();
//
//        while (!InputCompare) {
        // InputAnswer가 거짓으로 반환되는 동안 계속 반복 수행
//            InputAnswer()
//            InputCompare
//        }
//        if (InputCompare) InputEnd();
//
//    }
//}

// 야구게임 큰 덩이 파트> 랜덤함수 파트 > 숫자입력 받는 것 파트> 이미 생성된 배열과 비교하는 파트
// > 게임 종료됐을 때 파트