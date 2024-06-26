package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

//        기존에 OkListener 클래스로 구현해줬던 코드를 바로 익명 객체로 주입.
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭할게.");
            }
        });
        btnOk.click();
        Button btnCancel = new Button();

//        기존에 OkListener 클래스로 구현해줬던 코드를 바로 익명 객체로 주입.
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했어");
            }
        });
//        오버라이딩한 메소드를 호출하므로 CancelListener
        btnCancel.click();
    }
}
