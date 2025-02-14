package day10.lambda.ex01;

public class LambdaEx01 {
    public static void main(String[] args) {

        action((x,y) -> {
            int result = x + y;
            System.out.println("result1 = " + result);
        });

        action((x,y) -> {
            int result = x - y;
            System.out.println("result2 = " + result);
        });

    }

    private static void action(Calculable calculable) {
        int x = 20;
        int y = 10;
        calculable.calculate(20,10);
    }
}
