package ch08.sec03;

public interface RemoteControl {
//    인터페이스에서 필드는 자동으로 상수 처리된다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제스.");
        }
    }
}

