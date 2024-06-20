package ch03.sec03;

public class OverUnderEX {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0;i<5;i++) {
            var1++;
            System.out.println(var1);
        }
//        바이트 형식의 최대값 127을 초과하면 -128로 가버림.
//        오버플로우
        System.out.println("---------------------");
        byte var2 = -125;
        for(int i=0;i<5;i++) {
            var2--;
            System.out.println(var2);
        }
//        바이트 형식에서 최소값 -128 아래로 갈 수는 없어 최대값 127로 가버림
//        언더플로우
    }
}
