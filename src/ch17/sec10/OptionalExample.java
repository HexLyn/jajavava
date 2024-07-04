package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//Optional은 값이 있을수도, 없을수도 있다.
public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        리스트가 비어있을 경우 예외발생. NoSuchElementException.
//        double avg = list.stream()
//                        .mapToInt(Integer :: intValue)
//                                .average()
//                                        .getAsDouble();

//        방법1. 애초에 Optional을 double로 받는다.
        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if(optional.isPresent()) {
            System.out.println("방법 1 평균 : " + optional.getAsDouble());
        }else {
            System.out.println("0.0");
        }
//        방법2. orElse 활용. 없으면 0.0으로 초깃값 설정해줌.
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);

//        방법3. ifPresent 안쪽에서 a를 받아 처리한다.
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
//                ifPresent : 만약 해당 값이 존재한다면 해당 기능을 실행
//                현재는 해당값이 존재하지 않아 아무것도 출력되지 않는다.
                .ifPresent(a-> System.out.println(a));
    }
}
