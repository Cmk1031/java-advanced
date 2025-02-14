package day10.lambda.ex01;

/*
    Workable 인터페이스는 함수형 인터페이스이면
    반환값이 없는 work() 단일 추상 메서드를 가지고 있다.
 */
@FunctionalInterface
public interface Workable {
    void work(String name, String job);
}
