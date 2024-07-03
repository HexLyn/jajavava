package ch16.sec02.exam02;

public class Button {
//    정적 중첩 함수형 인터페이스
    @FunctionalInterface
    public static interface ClickListener {
//        추상 메소드
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
