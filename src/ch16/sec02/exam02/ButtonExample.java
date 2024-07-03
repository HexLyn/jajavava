package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

//        Ok버튼 객체에 람다식 주입
//        ClickListener 내의 onClick 부분을 람다식이 채워준다.
//        매개변수가 없는 람다식.
        btnOk.setClickListener(()->{
            System.out.println("ok clicked");
        });
//        click 메소드 내에서 onClick 호출 = 람다식 호출
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()->{
            System.out.println("cancel clicked");
        });
        btnCancel.click();
    }
}
