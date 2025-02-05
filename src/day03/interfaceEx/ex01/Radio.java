package day03.interfaceEx.ex01;

public class Radio implements RemoteControl{
    private int volume;

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("쉿모드 작동");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("쉿모드 해제");
            setVolume(this.memoryVolume);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Radio.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio.turnOff");
    }

    @Override
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

    public int getVolume() {
        return volume;
    }
}
