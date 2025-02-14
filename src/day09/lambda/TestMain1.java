package day09.lambda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestMain1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a thread!");
            }
        };

        //위 메서드를 한 문장으로 줄인다!
        Runnable runnable1 = () -> System.out.println("Hello from a thread!");



        /*Function<String, Integer> stringLength = String::length;

        List<String> names = Arrays.asList("A", "B", "C");
        names.forEach(System.out::println);*/

        //람다 표현식을 사용하여 "Hello Java!!"를 열번 출력하는 스레드 생성하세요.

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().filter(num -> num%2==0).forEach(System.out::println);



    }
}
