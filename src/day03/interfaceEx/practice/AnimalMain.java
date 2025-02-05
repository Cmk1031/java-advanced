package day03.interfaceEx.practice;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal;
        Pet pet;

        Cat cat = new Cat();

        animal = new Cat();
        pet = new Cat();

        animal.cry();
        pet.play();
        System.out.println(cat.getTail_size());


    }
}
