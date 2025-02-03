package day01.ex;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color);
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if(this.wifi) internet();
    }

    public void internet() {
        System.out.println("인터넷 연결");
    }

    @Override
    public void bell() {
        System.out.println("SmartPhone 전화");
    }
}