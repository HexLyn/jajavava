package ch06.sec07.exam03;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;


//    constructor 사용= 생성자 만들기,
//    alt+insert > constructor 선택.
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
//java 에선 이름이 같은 생성자를 여러개 만들 수 있다.
//이러한 생성자들을 구분하는 방법은 내부의 매개변수 타입, 개수, 순서 등으로 구분
//만약 똑같은 Korean, {name,ssn}으로 구성된 생성자는 앞에 존재하기 때문에 불가.
//아래와 같이 다르면 이름이 같아도 가능. (생성자 오버로딩, 메서드에 적용되면 그냥 오버로딩)
    public Korean(String nation, String name, String ssn) {
        this.nation = nation;
        this.name = name;
        this.ssn = ssn;
    }
}
