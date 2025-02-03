package day01.test.polymorphism1;

public abstract class Shape {
    private double area;
    private String name;

    public Shape(){}

    public Shape(String name) {
        this.name = name;
    }

    abstract void calculationArea();

    public void print() {}

}
