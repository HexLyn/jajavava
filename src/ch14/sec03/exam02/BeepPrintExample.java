package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
//        작업 스레드를 따로 만들어 비프음 작업과 출력 작업이 동시에 진행됨.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0;i<5;i++) {
                    toolkit.beep();
                    try { Thread.sleep(500); } catch(InterruptedException e) {}
                }
            }
        });

        thread.start();
        for(int i = 0; i<5;i++) {
            System.out.println("땅");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
