package discord.baseball;

import java.util.Scanner;

public class InputAnswer {
    private Scanner scanner;

    public InputAnswer(Scanner scanner) {
        this.scanner = scanner; // 매개변수로 받은 scanner를 멤버 변수에 할당
    }

    public int[] getInput() {
        int[] inputnum = new int[3];
        System.out.println("숫자를 입력해주세요 (세 자리 숫자를 공백 없이 연속으로 입력하세요): ");
        String input = scanner.next();

        // 입력받은 문자열에서 각 자리 숫자를 배열에 저장
        for (int i = 0; i < 3; i++) {
            inputnum[i] = Character.getNumericValue(input.charAt(i));
        }

        return inputnum;
    }
}


//sol
//package baseball;
//
//public class InputAnswer {
//    System.out.println("숫자를 입력해주세요. : ");
//    return scanner.nextLine();
//}