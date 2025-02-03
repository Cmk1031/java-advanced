package day01.ex;

public class SportsCar extends Car {
    public static final int SPEED = 10;
    @Override
    public void speedUp() {
        int speed = getSpeed();
        speed += SPEED;
        setSpeed(speed);
    }
}
