package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 ="홍길동";
        String strVar2 ="홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVar1 and strVar2 are the same");
        } else {
            System.out.println("strVar1 and strVar2 are not the same");
        }
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1 and strVar2 are the same");
        }
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
//        new로 문자열을 생성하게 되면 주소값이 다르게 생성된다.
//        이 때 ==으로 비교하게되면 주소값을 비교하며 false로 출력.
        if(strVar3 == strVar4) {
            System.out.println("strVar3 and strVar4 are the same");
        } else {
            System.out.println("strVar3 and strVar4 are not the same");
        }
//        하지만 equals로 문자열을 비교하면 둘 다 "홍길동"이므로 true.
        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3 and strVar4 are the same");
        }
    }
    }
//     결과.
//    strVar1과 strVar2는 참조가 같다.
//    strVar1과 strVar2는 문자열이 같다.
//    strVar3과 strVar4는 참조가 다르다.
//    strVar3과 strVar4는 문자열이 같다.