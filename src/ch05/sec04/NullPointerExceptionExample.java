package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int [] intArray = null;

//       컴파일 에러는 안뜨지만 디버깅 하면 색출됨. nullpointexception
//        null인 배열의 0번째 값을 할당했기 때문에 에러.
//        intArray[0] = 10;

        String str = null;
//        System.out.println("총 문자 수 " + str.length());
    }
}
