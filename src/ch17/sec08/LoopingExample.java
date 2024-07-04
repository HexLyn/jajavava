package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

//        잘못 작성한 경우
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(n-> System.out.println(n));
//        peek엔 최종 처리가 없으므로 동작하지 않는다.

//        중간 처리 메소드 peek()을 이용해 반복처리.
//        최종 처리 기능이 있으므로 잘 동작함.
        int total = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(n->System.out.println(n))
                .sum();
//        sum: 요소들의 합계를 계산해 int로 반환. 최종 처리 기능
        System.out.println(total);

//        최종 처리 기능 forEach를 이용한 반복처리
        Arrays.stream(intArr)
                .filter(a->a%2==0)
//                forEach: peek와 하는 역할은 동일하지만 최종 처리 기능이 있다.
                .forEach(n-> System.out.println(n));
    }
}
