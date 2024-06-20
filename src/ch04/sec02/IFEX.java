package ch04.sec02;

public class IFEX {
    public static void main(String[] args) {
        int score = 90;

        if(score >= 90) {
            System.out.println("gooot");
            System.out.println("A");
        }
//        이렇게 중괄호로 묶어주지 않으면 한 줄 까지만 if문 으로 인식
//        즉, not gooot는 if문에 묶여 해당하지 않으니
//        안나오지만 B는 출력된다.
        if(score < 90)
            System.out.println("not gooot");
            System.out.println("B");

    }
}
