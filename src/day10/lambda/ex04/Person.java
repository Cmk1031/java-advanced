package day10.lambda.ex04;

/*
    Person 클래스는 Calculable을 매개변수로 갖는 calculate 메서드를 갖고 있다.
 */


public class Person {

    public void action(Calculable calculable) {
        double result = calculable.calculate(20, 25);
        System.out.println("result = " + result);
    }


}
