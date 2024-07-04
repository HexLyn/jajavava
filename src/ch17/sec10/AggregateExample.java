package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5};

//        카운팅, count: 요소들의 개수를 long으로 반환.
        long count = Arrays.stream(arr)
                .filter(n->n%2==0)
                .count();
        System.out.println(count);
//        총합, sum: 요소들의 총합을 long으로 반환.
        long sum = Arrays.stream(arr)
                .filter(n->n%2==0)
                .sum();
        System.out.println(sum);
//        평균 average: 요소들의 평균을 OptionalDouble로 반환. double로 변경 필요.
        double avg = Arrays.stream(arr)
                .filter(n->n%2==0)
                .average()
                .getAsDouble();
//        getAsDouble을 명시해 double로 변환.
        System.out.println(avg);

        int max = Arrays.stream(arr)
                .filter(n->n%2==0)
                .max()
                .getAsInt();
//        max도 getAsInt로 형변환을 해주는 것으로 보아.
//        OptionalInt 라 볼 수 있다.
        System.out.println(max);

        int min = Arrays.stream(arr)
                .filter(n->n%2==0)
                .min()
                .getAsInt();
        System.out.println(min);

//        findFirst : 해당하는 요소들의 첫번째 값을 OptionalInt로 반환.
        int first = Arrays.stream(arr)
                .filter(n->n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println(first);
    }
}
