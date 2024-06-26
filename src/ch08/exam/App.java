package ch08.exam;

import java.util.Scanner;

public class App {
//    1. main문에 있던 것들을 끌고나와 필드로 만든다.
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

//     2. 기능별로 분리한다.
        public void printMenu () {
            System.out.println("전혀 객체지향 하고있지않아.");
            System.out.println("1.학생 수 2.점수 입력 3.점수 리스트 4.분석 5.종료");
            System.out.println("으으으으으으으으으으으으으으으으");
        }
        public int getSelect() {
                System.out.println(" 선택> ");
                return Integer.parseInt(scanner.nextLine());
            }

            private void analize() {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i=0; i < scores.length; i++) {
                    max = (max < scores[i]) ? scores[i] : max;
                    sum +=scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고 점수 :" + max);
                System.out.println("평균 점수 :" + avg);
            }

            public void getStudentNum() {
                System.out.println("학생 수>");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            }

            public void getScores() {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] = " + scores[i]);
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }

                public void exit() {
                    run = false;
                }

                public void executeCommand ( int selectNo){
                    if (selectNo == 1) {
                        getStudentNum();
                    } else if (selectNo == 2) {
                        getScores();
                    } else if (selectNo == 3) {
//                        printScore();
                    } else if (selectNo == 4) {
                        analize();
                    } else if (selectNo == 5) {
                    exit();
                }
            }
                public void run() {
                    while(run) {
                        printMenu();
                        int selectNo = getSelect();
                        executeCommand(selectNo);
                    }
                    System.out.println("프로그램 종료");

    }
public static void main(String[] args) {
    App app = new App();
    app.run();
}
}
