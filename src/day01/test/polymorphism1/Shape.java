package day01.test.polymorphism1;

public abstract class Shape {
    private double area;
    private String name;

    public Shape(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    abstract void calculationArea();

    public void print() {}

}
