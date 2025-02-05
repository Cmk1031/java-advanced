package day03.interfaceEx.test.problem;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        setDistance(getDistance() + (double) hours/2.0 * (double) getSpeed());
    }

}
