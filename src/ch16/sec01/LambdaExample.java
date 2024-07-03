package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
//        action 내의 람다 함수가 실제로는 Calculable 내에 있는 calculate 함수를 의미한다.
        action((x,y) -> {
            int result = x+y;
            System.out.println(result);
        });
        action((x,y)->{
            int result = x-y;
            System.out.println(result);
        });
    }
    public static void action(Calculable calculable) {
        int x=10;
        int y=20;
//        해당 부분에 제공되는 함수 역할이 람다식이다.
        calculable.calculate(x,y);
    }
}
