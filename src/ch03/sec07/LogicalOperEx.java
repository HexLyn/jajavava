package ch03.sec07;

public class LogicalOperEx {
    public static void main(String[] args) {
        int charCode = 'A';

//        & and 이므로 모두 true일 때 출력.
        if((65<=charCode) & (charCode<=90)) {
            System.out.println("UPPER");
        }
        if((97<=charCode) && (charCode<=122)) {
            System.out.println("LOWER");
        }
        if((48<=charCode) && (charCode<=57)) {
            System.out.println("Number");
        }
//      mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        int value=6;

        if((value%2==0) | (value%3==0)) {
            System.out.println("2,3");
        }

        boolean result = (value%2 ==0) || (value%3==0);
        if(!result) {
            System.out.println("not 2,3");
        }

    }
}
