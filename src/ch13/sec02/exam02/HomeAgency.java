package ch13.sec02.exam02;

//타입 파라미터 P를 Home으로 대체
public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
