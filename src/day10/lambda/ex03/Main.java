package day10.lambda.ex03;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setX(10);
        person.setY(5);

        person.action((x,y) ->  (x+y));
        person.action((x,y) -> sum(x,y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
