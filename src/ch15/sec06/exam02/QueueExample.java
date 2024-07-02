package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue 컬렉션 생성
//        Queue는 인터페이스기 때문에 객체 생성 불가.
//        LinkedList는 Queue의 하위 요소기 때문에 업캐스팅 가능.
        Queue<Message> messageQueue = new LinkedList<>();

//        메시지 열기
        messageQueue.offer(new Message("sendmail", "길동"));
        messageQueue.offer(new Message("sendSNS", "길동2"));
        messageQueue.offer(new Message("sendm23l", "길동3"));

//        큐가 비어있지 않을 때까지 메시지를 하나씩 꺼내어 처리.
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
//            poll : 큐에서 요소 하나 꺼내기.
//            FIFO기 때문에 가장 먼저 넣은 홍길동이 나옴.
            switch (message.command) {
//                message.to는 요소를 돌 때마다 달라진다.
                case "sendmail":
                    System.out.println(message.to);
                    break;
                case "sendSNS" :
                    System.out.println(message.to);
                    break;
                case "sendm23l":
                    System.out.println(message.to);
            }
        }
    }
}
