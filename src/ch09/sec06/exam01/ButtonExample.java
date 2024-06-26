package ch09.sec06.exam01;

//OK 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
//        메소드/생성자 안에 있으면 로컬 클래스이다.
//        본 OkListener 는 main 클래스 안에 위치.
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK버튼을 클릭했습니다.");
            }
        }
//        OKListener 는 ClickListener 를 상속 받았기
//        때문에 ClickListener 타입으로 주입 가능(업캐스팅)
        btnOk.setClickListener(new OkListener());
        btnOk.click();

        Button btnCancel = new Button();
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancle 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}