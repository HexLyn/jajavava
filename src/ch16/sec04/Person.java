package ch16.sec04;

// calc 함수는 매개변수가 2개고 return값이 double인 함수 - 예측가능
public class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10,4);
        System.out.println(result);
    }
}
