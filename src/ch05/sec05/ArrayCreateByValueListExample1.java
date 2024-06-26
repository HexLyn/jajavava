package ch05.sec05;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
//        중괄호 만으로 초기화 해주고 있다.
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};
        System.out.println("Season: " + season[0]);
        System.out.println("Season: " + season[1]);
        System.out.println("Season: " + season[2]);
        System.out.println("Season: " + season[3]);

//       season[1]의 값을 "summer"에서 "여름"으로 바꿔줌
        season[1] = "여름";
        System.out.println("Season: " + season[1]);
        System.out.println();

        int[] scores = {90, 80, 70, 60};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum: " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("Avg: " + avg);
    }
}
