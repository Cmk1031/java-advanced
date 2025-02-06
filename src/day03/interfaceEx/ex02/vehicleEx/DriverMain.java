package day03.interfaceEx.ex02.vehicleEx;

import java.util.ArrayList;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bus());
        vehicles.add(new Taxi());
        vehicles.add(new Hourse());
        for(int i=0; i<vehicles.size(); i++) {
            driver.drive(vehicles.get(i));
        }

        /*Vehicle vehicle = new Bus();
        driver.drive(vehicle);

        vehicle = new Taxi();
        driver.drive(vehicle);

        vehicle = new Hourse();
        driver.drive(vehicle);*/

        /*Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);

        Hourse hourse = new Hourse();
        driver.drive(hourse);*/
    }
}
