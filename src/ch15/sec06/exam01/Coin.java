package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Coin {
    private int value;



//    AllArgsConstructor와 동일
//    public Coin(int value) {
//        this.value = value;
//    }

//    Getter와 동일
//    public int getValue() {
//        return value;
//    }
}
