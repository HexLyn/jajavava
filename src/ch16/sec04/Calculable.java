package ch16.sec04;

@FunctionalInterface
//함수형 인터페이스는 무조건 매개변수를 하나만 넣어야 한다.
public interface Calculable {
    double calc(double x, double y);
}
