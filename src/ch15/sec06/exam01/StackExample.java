package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

//        stack은 한 쪽이 막힌 상자로 맨 위에만 쌓고, 뺄 수 있다.
        coinBox.push(new Coin(5));
        coinBox.push(new Coin(6));
        coinBox.push(new Coin(7));
        coinBox.push(new Coin(8));
//        coinBox.peek()

//        마지막에 넣은 8부터 출력.
//        LIFO
        while(!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue());
        }
    }
}
