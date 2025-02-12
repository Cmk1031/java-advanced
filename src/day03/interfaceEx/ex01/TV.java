package day03.interfaceEx.ex01;

public class TV implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("TV.turnOff");
    }

    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 셋팅 되었습니다.");
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
