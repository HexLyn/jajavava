package ch07.sec10.exam02;

//부모인 Animal이 추상메서드 이기때문에 초기에 오류 발생
//alt + enter로 해당 오류 해결방법 확인.
public class CAT extends Animal {

    @Override
    public void sound() {
        System.out.println("쥐를자바");
    }
}
