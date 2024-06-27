package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] selectNumber = new int[6];
//        시드값을 줘서 랜덤값이 고정된 랜덤값이 나온다.
        Random random = new Random(3);
        System.out.println("선택 번호");
        for (int i = 0; i < 6; i++) {
//            어떤 숫자가 나오든 1을 더해준다.
//            원래는 0~43 생성이 1~45 생성으로 바뀜
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨 번호");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

//        당첨 여부, 비교하기 전 정렬해서 비교
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
//        Array.equals로 비교.
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨 여부");
        if(result) {
            System.out.println("1등");
        } else {
            System.out.println("당첨 안됨");
        }
    }
}
