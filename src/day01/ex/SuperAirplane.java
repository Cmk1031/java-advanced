package day01.ex;

public class SuperAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int ADVANCED = 2;

    public int flyMode = NORMAL;

    public void fly() {
        if(flyMode==ADVANCED) {
            System.out.println("초음속 비행");
        } else {
            super.fly();
        }
    }
}
