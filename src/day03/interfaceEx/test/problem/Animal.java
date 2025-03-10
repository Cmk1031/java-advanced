package day03.interfaceEx.test.problem;

public abstract class Animal {
    private int speed;
    private double distance;

    public Animal(int speed) {
        this.speed = speed;
    }

    abstract void run(int hours);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
