package day10.lambda.ex03;

/*
    Person 클래스는 Calculable을 매개변수로 갖는 calculate 메서드를 갖고 있다.
 */


public class Person {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void action(Calculable calculable) {
        double result = calculable.calculate(this.x, this.y);
        System.out.println("result = " + result);
    }


}
