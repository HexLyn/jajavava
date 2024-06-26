package ch09.sec06.exam01;

// 인터페이스는 기본적으로 추상 메소드로 생성한다.
public class Button {
    public static interface ClickListener {
        void onClick();
    }
//    Button 클래스에서 ClickListener 인터페이스를 필드로 가지고 있다.
    private ClickListener clickListener;

//    set 메소드 에서는 ClickListener 를 받아온 값으로 변경해준다.
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
//    받아온 객체의 onClick을 호출
    public void click() {
        this.clickListener.onClick();
    }
}

