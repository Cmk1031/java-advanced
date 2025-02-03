package day01.test.polymorphism1;

public class Rectangular extends Shape {
    private double width;
    private double height;

    public Rectangular(double width, double height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    void calculationArea() {
        System.out.println(getName()+" 면적은 "+width*height);
    }
}
