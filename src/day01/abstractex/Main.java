package day01.abstractex;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        animalSound(dog);
        animalSound(cat);
    }
    public static void animalSound(Animal animal) {
        if(animal instanceof Dog)
            animal.sound();
    }
}
