package discord.baseball;
public class InputCompare {
    public static boolean compareNumbers(int[] computer, int[] inputnum) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            if (computer[i] == inputnum[i]) {
                strikeCount++;
            } else if (contains(computer, inputnum[i])) {
                ballCount++;
            }
        }

        if (ballCount > 0) {
            System.out.println(ballCount + "볼");
        }
        if (strikeCount > 0) {
            System.out.println(strikeCount + "스트라이크");
        }
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫띵");
        }
        if (strikeCount == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            return true;
        }

        return false;
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}

//sol
//package baseball;
//
//public class InputCompare {
//    int[] ball = new int[10];
//    int[] strike; = new int[10]
//
//            for(let 1=0; i<3; i++) {
//        if (computer[i] === inputnum[i]) {
//            strike[i] = computer[i];
//        } else if () {
//            ball[i] = computer [i]
//        }
//    }
//
//    if(ball.size() > 0) {
//        System.out.println(ball.size() + "볼 ");
//    }
//    if(strike.size() > 0) {
//        System.out.println(strike.size() + "스트라이크 ");
//    }
//    if(ball.size() == 0 && strike.size() == 0) {
//        System.out.println("낫띵");
//    }
//    if(strike.size() == 3) {
//        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
//        return true;
//    }
//}

//값 + 배열 자리까지 맞춘건 '스트라이크'
//값만 존재하고 배열 자리가 틀린건 '볼'
//근데 스트라이크, 볼이 중첩되지는 않음. 구분해야 함.
//먼저 스트라이크 계산을 하면서 배열을 빼고, 그 다음에 남은걸로 볼 계산을한다?




















// sol
//package baseball;
//
//public class InputCompare {
//    int[] ball = new int[10];
//    int[] strike; = new int[10]
//
//    for(let 1=0; i<3; i++) {
//        if (computer[i] === inputnum[i]) {
//            strike[i] = computer[i];
//        } else if () {
//            ball[i] = computer [i]
//        }
//    }
//
////    자바에서 배열의 길이를 확인할 때 .length
//    if(ball.size() > 0) {
//        System.out.println(ball.size() + "볼 ");
//    }
//    if(strike.size() > 0) {
//        System.out.println(strike.size() + "스트라이크 ");
//    }
//    if(ball.size() == 0 && strike.size() == 0) {
//        System.out.println("낫띵");
//    }
//    if(strike.size() == 3) {
//        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
//        return true;
//    }
//}
//
////값 + 배열 자리까지 맞춘건 '스트라이크'
////값만 존재하고 배열 자리가 틀린건 '볼'
////근데 스트라이크, 볼이 중첩되지는 않음. 구분해야 함.
////먼저 스트라이크 계산을 하면서 배열을 빼고, 그 다음에 남은걸로 볼 계산을한다?
//
////inputrandom에서의 랜덤값, inputanswer에서 유저 입력값 두 개를 가져와 비교해야한다.