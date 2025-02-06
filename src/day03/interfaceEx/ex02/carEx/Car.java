package day03.interfaceEx.ex02.carEx;

public class Car {

    /*Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();
    */
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public void run() {
        tire.roll();

    }
}
