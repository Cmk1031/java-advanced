package day10.lambda.ex03;

@FunctionalInterface
public interface Calculable {
    //추상 메서드 , 매개변수와 리턴값이 있는 추상 메서드
    double calculate(double x,double y);
}
