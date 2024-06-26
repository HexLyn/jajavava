package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호 :" + tokens[0]);
        System.out.println("제목 :" + tokens[1]);
        System.out.println("내용 :" + tokens[2]);
        System.out.println("성명 :" + tokens[3]);
        System.out.println();

        for(int i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
//        향상된 for문.
//        인덱스가 필요한 for문은 기존 방식이 더 유용.
//        하지만 for문을 돌리기만 한다면 향상된 for문이 유리.
        for(String str : tokens){
            System.out.println(str);
        }
    }
}
