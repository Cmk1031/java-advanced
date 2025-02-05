package day03.interfaceEx.ex01;

public interface RemoteControl {

    public static final int MAX_VOLUME = 30;
    // = int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();

    void setVolume(int volume);
    int getVolume();

    default void setMute(boolean mute){
        if(mute){
            System.out.println("쉿 모드로 전환됩니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("쉿 모드가 해제되었습니다.");
        }
    }
}
