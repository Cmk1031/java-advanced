package day01.test.polymorphism1;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculationArea() {
        System.out.println("원의 면적은 "+ radius*radius*PI);
    }
}
