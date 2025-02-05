package day03.interfaceEx.ex01;

public class RemoteControlMain {
    public static void main(String[] args) {
        /*RemoteControl remoteControl;
        remoteControl = new TV(); //인터페이스 자신을 구현한 구현객체(TV)를 담을 수 있다.
        remoteControl.turnOn();

        remoteControl = new Radio();
        remoteControl.turnOn();

        System.out.println("리모콘의 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘의 최대 볼륨: " + RemoteControl.MIN_VOLUME);*/

        /*
        1. 리모콘을 구입한다.
        2. 새로 산 리모컨에 TV를 설정한다.
        3. 리모콘을 이용하여 TV를 켠다
        4. 리모컨을 이용하여 볼륨을 10으로 설정한다.
        5. 리모컨을 이용하여 TV를 끈다.
         */

        RemoteControl remoteControl;
        remoteControl = new TV();
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.turnOff();

        /*
        1. 리모컨을 라디오로 페어링 한다.
        2. 리모컨을 이용하여 라디오를 켠다.
        3. 리모컨을 이용하여 볼륨을 20으로 설정하고 설정값을 확인한다.
        4. 리모컨을 이용하여 라디오를 끈다.
         */
        remoteControl = new Radio();
        remoteControl.turnOn();
        remoteControl.setVolume(20);
        System.out.println(remoteControl.getVolume());
        remoteControl.turnOff();

        remoteControl.setMute(true);
        remoteControl.setMute(false);

    }
}
