package ch15.sec03.exam02;

//import lombok.AllArgsConstructor;
//@AllArgsConstructor
//안되는 이유 찾기.

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
// hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

// equals 재정의
    @Override
    public boolean equals(Object obj) {
//        obj가 Member타입일 경우 target 이란 이름의 객체로 다운캐스팅.
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}
