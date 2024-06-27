package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        for(int i = 0; i<5;i++) {
            System.out.println("땅");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}
