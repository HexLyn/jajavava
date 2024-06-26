package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

@Data

//ctrl alt o 누르면 안쓰는 import 자동으로 삭제.
public class Member2 {
    private String id;
    @NonNull
    //필수항목. null 이면 안됨. 따라서 RequiredArgsConstructor에 의해
    // 해당 필드를 포함하는 생성자가 만들어짐.
    private String name;
    private int age;
}
