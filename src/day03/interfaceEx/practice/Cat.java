package day03.interfaceEx.practice;

public class Cat extends Tail implements Animal, Pet{

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void play() {
        System.out.println("야옹놀자");
    }
}
