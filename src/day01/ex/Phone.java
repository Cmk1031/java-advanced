package day01.ex;

public class Phone {
    public String model;
    public String color;

    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void bell() {
        System.out.println("Phone전화");
    }

    public void volumeUp() {
        System.out.println("볼륨업");
    }
}
