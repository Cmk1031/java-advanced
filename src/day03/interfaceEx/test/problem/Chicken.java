package day03.interfaceEx.test.problem;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        setDistance(getDistance() + (double) hours * (double) getSpeed());
    }

    @Override
    public void fly() {
        int speed = getSpeed();
        setSpeed(speed *=2);
    }
}
