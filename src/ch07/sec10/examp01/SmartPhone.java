package ch07.sec10.examp01;

public class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
    }
    void internetSearch() {
        System.out.println("인터넷 검색을 해볼까");
    }
}
