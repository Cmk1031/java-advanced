package day01.ex;

public class CarMain {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        mycar1.setSpeed(3);
        System.out.println(mycar1.getSpeed());

        SportsCar mycar2 = new SportsCar();
        mycar2.setSpeed(50);
        System.out.println(mycar2.getSpeed());

        for(int i=0; i<10; i++) {
            mycar1.speedUp();
            mycar2.speedUp();
        }
        System.out.println(mycar1.getSpeed());
        System.out.println(mycar2.getSpeed());
        mycar1.stop();
        mycar2.stop();
        System.out.println(mycar1.getSpeed());
        System.out.println(mycar2.getSpeed());


    }
}
