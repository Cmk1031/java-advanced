package day03.interfaceEx.ex01;

public interface RemoteControl {

    public static final int MAX_VOLUME = 30;
    // = int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();

    void setVolume(int volume);
    int getVolume();
}
