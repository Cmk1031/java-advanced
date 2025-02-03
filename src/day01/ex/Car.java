package day01.ex;

public class Car {
    public static final int ZERO = 0;
    private int speed = ZERO;

    public final void stop() {
        System.out.println("차를 멈춘다");
        this.speed = ZERO;
    }

    public void speedUp() {
        speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
