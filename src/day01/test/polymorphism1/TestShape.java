package day01.test.polymorphism1;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        Circle circle = new Circle(10.0, "원");
        Rectangular rectangular = new Rectangular(10.0,20.0, "직사각형");
        shape[0] = circle;
        shape[1] = rectangular;
        TestShape.print(shape);
    }
    public static void print(Shape[] shape) {
        for (Shape shape1 : shape) {
            shape1.calculationArea();
        }
    }
}
