package day01.ex;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();


        SuperAirplane superAirplane = new SuperAirplane();
        superAirplane.takeOff();
        superAirplane.flyMode = SuperAirplane.ADVANCED;
        superAirplane.fly();
        superAirplane.land();

    }
}
